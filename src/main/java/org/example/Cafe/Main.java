package org.example.Cafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean trade = true;
        Customer customer = new Customer(10000);
        Menu menu = new Menu();
        CoffeeType coffeeType = null;

        while (trade) {
            System.out.println("1.커피 주문 | 2.구매한 커피 보기 | 3.바리스타 소지금 | 4. 손님 소지금 ");
            int cafeTrade = sc.nextInt();
            switch (cafeTrade) {
                case 1:
                    int orderMoney = customer.getMoney();
                    customer.orderCoffee(menu, orderMoney);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("이용해주셔서 감사합니다.");
                    trade = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}
