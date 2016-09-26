package lab1;

/**
 * Created by developer-kc3e on 26.9.16.
 */
public class MainApplication {
    // Конструктор класса отсутствует!!!
// Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
// Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
// Анализ аргументов командной строки и создание для них
// экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        int sumCol = 0;
        boolean ex = false;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese(Integer.valueOf(parts[1]));
                sumCol += breakfast[itemsSoFar].nutritious();

            } else if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(Integer.valueOf(parts[1]), parts[2]);
                sumCol += breakfast[itemsSoFar].nutritious();


            } else if (parts[0].equals("-calories")) {
                ex = true;
            }


            itemsSoFar++;
        }
        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        if (ex) {
            System.out.println("Общая калорийность завтрака составляет " + sumCol + " ккал");
        }
        System.out.println("Всего хорошего!");
    }
}
