package _001_builder.main_lesson.Pizza.Builders;

import _001_builder.main_lesson.Pizza.Components.*;

public class Director {
    /**
     * Takes a builder, then passes arguments to its setters
     */
    public void constructSeaPizza(Builder builder) {
        builder.setDough(Dough.THIN);
        builder.setSauce(Sauce.WHITE);
        builder.setCheese(Cheese.MOZZARELLA);
        builder.setMeet(Meat.SALMON, Meat.SRIMPS);
        builder.setVegetables(Vegetables.BELL_PEPPER, Vegetables.OLIVES);
    }

    /**
     * Takes a builder, then passes arguments to its setters
     */
    public void constructMeatPizza(Builder builder) {
        builder.setDough(Dough.THICK);
        builder.setSauce(Sauce.RED);
        builder.setCheese(Cheese.CHEDDER, Cheese.MOZZARELLA);
        builder.setMeet(Meat.BAKED_BEEF, Meat.SAUSAGES, Meat.SMOKED_MEAT);
        builder.setVegetables(Vegetables.BELL_PEPPER, Vegetables.OLIVES, Vegetables.PICKELS);
    }
}
