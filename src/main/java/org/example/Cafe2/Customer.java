package org.example.Cafe2;

import java.util.List;

public class Customer {

    private int money;

    public int getMoney() {
        return money;
    }

    public Customer(int money) {
        this.money = money;
    }

    public Customer() {
    }

    Menu menu = new Menu();


    public void order(int money, Baristar baristar) {
        menu.coffeeMenuBoard();
        baristar.makingCoffee(money);

    }

    public void remainingBaristaMoney() {
        System.out.println("손님의 남은 소지금 " + money + "원");
    }

    public void pay(int price) {
        money -= price;
    }


//    public void drinkCoffee() {
//        Coffee getCoffee1 = (Coffee) coffees.get(0);
//        System.out.println(getCoffee1.getOrderCoffeeName() + getCoffee1.getOrderPrice());
//    }
}
