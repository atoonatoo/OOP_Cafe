package org.example.Cafe;

public class Coffee {
    private String orderCoffeeName;
    private int orderPrice;

    public String getOrderCoffeeName() {
        return orderCoffeeName;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderCoffeeName(String orderCoffeeName) {
        this.orderCoffeeName = orderCoffeeName;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Coffee(String orderCoffeeName, int orderPrice) {
        this.orderCoffeeName = orderCoffeeName;
        this.orderPrice = orderPrice;
    }

    public Coffee() {

    }


}