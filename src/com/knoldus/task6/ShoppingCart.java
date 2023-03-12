package com.knoldus.task6;

public class ShoppingCart {
    Items item;
    int total_cost;

    public ShoppingCart(Items item) {
        this.item = item;
    }

    int calculateTotalCost() {
        total_cost = item.price * item.quantity;
        return total_cost;
    }
}