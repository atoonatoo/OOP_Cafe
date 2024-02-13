package org.example.Cafe2.CoffeeList;

public class Macchiato implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "카라멜마끼아또";
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
