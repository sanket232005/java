package com.app.fruits;

public class Apple extends Fruit {
    public Apple(String name, double weight, String color) {
        super(name, color, weight);
    }

   
    public String taste() {
        return "sweet n sour";
    }
}
