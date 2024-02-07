package org.example.Cafe.CoffeeList;

public class Espresso implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "Espresso";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
