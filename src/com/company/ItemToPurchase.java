package com.company;

import java.util.ArrayList;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private int itemTotal;

    private String itemDescription;
    public ItemToPurchase(){
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }
    public ItemToPurchase(String name, String description, int price, int quantity){
         itemName = name;
         itemDescription = description;
         itemPrice = price;
         itemQuantity = quantity;
    }

    public void setName(String name){
        this.itemName = name;
    }
    public void setPrice(int price){
        itemPrice = price;
    }
    public void setQuantity(int quantity){
        itemQuantity = quantity;
    }
    public void setTotal(int total){
        itemTotal = itemPrice * itemQuantity;
    }

    public void setDescription(String description){
        itemDescription = description;
    }





    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public int getTotal() {
        return itemTotal;
    }
    public String getDescription(){
        return itemDescription;
    }

    public void printItemCost(){
        System.out.printf("%s %d @ $%d = $%d%n", getName(), getQuantity(), getPrice(),getTotal());
    }

    public void printItemDescription(){
        System.out.printf("%s: %s.%n", getName(), getDescription());
    }
}
