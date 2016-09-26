package lab1;

/**
 * Created by developer-kc3e on 26.9.16.
 */
public class Cheese extends Food {

    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    @Override
    public void nutritious() {

    }

// Переопределять метод equals() в данном классе не нужно, т.к. он
// не добавляет новых полей данных, а сравнение по внутреннему полю name
// уже реализовано в базовом классе
// Переопределять метод toString() в данном классе не нужно, т.к. он
// не добавляет внутренних полей данных, а возврат поля name уже
// реализован в версии toString() базового класса
}