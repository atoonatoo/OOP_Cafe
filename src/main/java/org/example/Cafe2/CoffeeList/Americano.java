package org.example.Cafe2.CoffeeList;

public class Americano implements CoffeeList {

    @Override
    public String getCoffeeNmae() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
