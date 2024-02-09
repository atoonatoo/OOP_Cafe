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
        String orderCoffeeName = coffeeList.getCoffeeNmae();
        int orderPrice = coffeeList.getPrice();

        Coffee coffee = new Coffee();

        coffee.setOrderCoffeeName(orderCoffeeName);
        coffee.setOrderPrice(orderPrice);

        List coffees = new ArrayList();
        coffees.add(coffee);
        Coffee getCoffee1 = (Coffee) coffees.get(0);
        System.out.println(getCoffee1.getOrderCoffeeName() + getCoffee1.getOrderPrice());
        balanceaCcumulate(coffeeList.getPrice());
        System.out.println("주문하신 " + coffeeList.getCoffeeNmae() + " 나왔습니다. 지불하실 비용은 " + coffeeList.getPrice() + "원 입니다.");
    }


    private void balanceaCcumulate(int price) {
        balance += price;
    }

    public void remainingBaristaMoney() {
        System.out.println("바리스타 소지금 " + balance + "원");
    }

}
