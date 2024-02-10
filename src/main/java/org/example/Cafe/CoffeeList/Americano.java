package org.example.Cafe.CoffeeList;

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
