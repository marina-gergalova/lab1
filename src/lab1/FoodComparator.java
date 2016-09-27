package lab1;

import java.util.Comparator;

/**
 * Created by developer-kc3e on 27.9.16.
 */
public class FoodComparator implements Comparator {
    @Override
    public int compare(Object f1, Object f2) {
        Food food1 = (Food)f1;
        Food food2 = (Food)f2;
        if (food1.nutritious() > food2.nutritious()) return 1;
        if (food2.nutritious() > food1.nutritious()) return -1;
        return 0;
    }
}
