package org.example.Cafe.CoffeeList;

public class Macchiatto implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "Macchiatto";
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}