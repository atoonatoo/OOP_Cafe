package org.example;

import org.example.CoffeeList.*;

import java.util.Scanner;

public class Menu {

    public void boardMenu(int money) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Menu--------");
        System.out.println("1. Americano : 1500원");
        System.out.println("2. Cappuccino : 2000원");
        System.out.println("3. Macchiatto : 2500원");
        System.out.println("4. Espresso : 2500원");
        System.out.println("--------------------");
        System.out.println(" 메뉴를 선택해 주세요.");
//
//        Baristar baristar = new Baristar();
//        Customer customer = new Customer();
//        CoffeeType coffeeType;
//
//        String customerinput = sc.nextLine();
//        coffeeType = CoffeeType.valueOf(customerinput);
//
//        CoffeeList coffeeList;
//        coffeeList = null;
//
//        switch (coffeeType){
//            case Americano -> coffeeList = new Americano();
//            case Cappuchino ->  coffeeList = new Cappuchino();
//            case Macchiatto -> coffeeList = new Macchiatto();
//            case Espresso -> coffeeList = new Espresso();
//        }

//        baristar.takeCoffee(coffeeList.getCoffeeName(), money, customer, coffeeType);
    }

}
