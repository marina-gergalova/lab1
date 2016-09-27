package lab1;

import java.util.Arrays;

/**
 * Created by developer-kc3e on 26.9.16.
 */
public class MainApplication {
    // Конструктор класса отсутствует!!!
// Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
// Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[4];
// Анализ аргументов командной строки и создание для них
// экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        int sumCol = 0;
        boolean ex1 = false;
        boolean ex2 = false;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese(Integer.valueOf(parts[1]));
                sumCol += breakfast[itemsSoFar].nutritious();
                itemsSoFar++;
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(Integer.valueOf(parts[1]), parts[2]);
                sumCol += breakfast[itemsSoFar].nutritious();
                itemsSoFar++;
            } else if (parts[0].equals("-calories")) {
                ex1 = true;
            } else if (parts[0].equals("-sort")) {
                ex2 = true;
            }



        }

        if (ex2) {
            Arrays.sort(breakfast, (f1, f2) -> {
                if (f1.nutritious() > f2.nutritious()) return 1;
                if (f2.nutritious() > f1.nutritious()) return -1;
                return 0;
            });
        }

        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        if (ex1) {
            System.out.println("Общая калорийность завтрака составляет " + sumCol + " ккал");
        }
        System.out.println("Всего хорошего!");


    }
}
