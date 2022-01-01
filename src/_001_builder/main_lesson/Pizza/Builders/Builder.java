package _001_builder.main_lesson.Pizza.Builders;

import _001_builder.main_lesson.Pizza.Components.*;

/**
 * An interface that defines setters' signatures for Pizza builders.
 */
public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeet(Meat... meat);
    void setVegetables(Vegetables... vegetables);
}

