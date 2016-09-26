package lab1;

/**
 * Created by developer-kc3e on 26.9.16.
 */
public abstract class Food implements Consumable, Nutritious {
    String name = null;
    String calories = null;
    public Food(String name) {
        this.name = name;
        this.calories = calories;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
// Шаг 1
        if (name==null || ((Food)arg0).name==null) return false; // Шаг 2
        return name.equals(((Food)arg0).name); // Шаг 3
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void nutritious(String calories) {
        System.out.println(name + " имеет " + calories+ " ккал");

    }
// Реализация метода consume() удалена из базового класса
}