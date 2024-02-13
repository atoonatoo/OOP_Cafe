package org.example.Cafe2.CoffeeList;

public class Espresso implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "에스프레소";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
