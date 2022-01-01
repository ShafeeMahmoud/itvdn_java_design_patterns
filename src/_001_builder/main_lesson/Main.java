package _001_builder.main_lesson;

import _001_builder.main_lesson.Pizza.Builders.*;
import _001_builder.main_lesson.Pizza.*;


public class Main {
    public static void main(String[] args) {

        // We're creating a builder, which has properties like Pizza properties and setters to them
        PizzaBuilder builder = new PizzaBuilder();
        // Then we create a director
        Director director = new Director();

        director.constructSeaPizza(builder);
        Pizza seaPizza = builder.getResult();
        System.out.println("Your order is sea pizza: " + seaPizza);

        director.constructMeatPizza(builder);
        Pizza meatPizza = builder.getResult();
        System.out.println("Your odrder is meat pizza: " + meatPizza);


    }
}
