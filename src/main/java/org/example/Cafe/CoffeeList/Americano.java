package org.example.Cafe.CoffeeList;

public class Americano implements CoffeeList {

    @Override
    public String getCoffeeName() {
        return "Americano";
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
