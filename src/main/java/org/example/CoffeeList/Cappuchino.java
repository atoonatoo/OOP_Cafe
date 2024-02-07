package org.example.CoffeeList;

public class Cappuchino implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "Cappuchino";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
