package org.example.Cafe.CoffeeList;

public class Cappuccino implements CoffeeList{

    @Override
    public String getCoffeeNmae() {
        return "카푸치노";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
