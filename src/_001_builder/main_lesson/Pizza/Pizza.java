package _001_builder.main_lesson.Pizza;

import _001_builder.main_lesson.Pizza.Components.*;

import java.util.List;

/**
 * A class that has properties, constructor and getters, but no setters.
 */
public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Vegetables> vegetables;

    public Pizza(Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Vegetables> vegetables) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Cheese> getCheese() {
        return cheese;
    }

    public List<Meat> getMeat() {
        return meat;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", vegetables=" + vegetables +
                '}';
    }
}
