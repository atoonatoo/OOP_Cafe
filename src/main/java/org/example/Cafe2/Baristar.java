package org.example.Cafe2;

import org.example.Cafe2.CoffeeList.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baristar {
    Scanner sc = new Scanner(System.in);
    private int balance;

    public int getBalance() {
        return balance;
    }

    public Baristar() {
    }

    public Baristar(int balance) {
        this.balance = balance;
    }

    public void makingCoffee(int money) {
        String orderInput = sc.nextLine();
        CoffeeType coffeeType = CoffeeType.valueOf(orderInput);
        CoffeeList coffeeList;
        switch (coffeeType) {
            case Americano -> coffeeList = new Americano();
            case Cappuccino -> coffeeList = new Cappuccino();
            case Macchiato -> coffeeList = new Macchiato();
            case Espresso -> coffeeList = new Espresso();
            default -> throw new IllegalStateException("다시 주문해주세요 " + coffeeType);
        }

        Coffee coffee = new Coffee();
        coffee.setOrderCoffeeName(coffeeList.getCoffeeNmae());
        coffee.setOrderPrice(coffeeList.getPrice());
        List coffees = new ArrayList();
        coffees.add(coffee);
//        Coffee getCoffee1 = (Coffee) coffees.get(0);
//        System.out.println(getCoffee1.getOrderCoffeeName() + getCoffee1.getOrderPrice());
        balanceaCcumulate(coffeeList.getPrice());
    }

    private void balanceaCcumulate(int price) {
        balance -= price;
    }

    public void remainingBaristaMoney(){
    System.out.println("바리스타 소지금 " + balance + "원");
    }

}
