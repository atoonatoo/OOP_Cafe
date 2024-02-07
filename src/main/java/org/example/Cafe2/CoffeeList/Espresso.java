package org.example.Cafe2.CoffeeList;

public class Espresso implements CoffeeList{
    @Override
    public String getCoffeeNmae() {
        return "에스프레소";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
