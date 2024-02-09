package org.example.Cafe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean trade = true;
        Customer customer = new Customer(10000);
        Baristar baristar = new Baristar(0);
        int money = customer.getMoney();


        while (trade){
            System.out.println("1. 커피주문 | 2. 내가 갖고 있는 커피 확인 | 3. 바리스타의 소지금 | 4. 내 소지금 | 0. 거래종료");
            int action = sc.nextInt();
            switch (action){
                case 1:
                    customer.order(money, baristar);
                    break;
                case 2:
//                    customer.drinkCoffee();
                    break;
                case 3:
                    baristar.remainingBaristaMoney();
                    break;
                case 4:
                    customer.remainingBaristaMoney();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}
