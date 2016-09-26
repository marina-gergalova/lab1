package lab1;

/**
 * Created by developer-kc3e on 26.9.16.
 */
public abstract class Food implements Consumable, Nutritious {
    private String name = null;
    private int calories ;

    public Food(String name, int calories) {
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
        return name + " калорийностью " + nutritious();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }





    public int nutritious() {
        return calories;

    }
// Реализация метода consume() удалена из базового класса
}