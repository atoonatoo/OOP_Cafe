package org.example;

public class Customer {

    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public Customer(int money) {
        this.money = money;
    }

    public Customer() {

    }

    public void orderCoffee(Menu menu, int money) {
        menu.boardMenu(money);
    }

}
