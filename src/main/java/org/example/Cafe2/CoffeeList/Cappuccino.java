package org.example.Cafe2.CoffeeList;

public class Cappuccino implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "카푸치노";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
