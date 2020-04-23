package com.company;
import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private int numOfItems;
    private int totalCost;
    private int itemTotal;
    ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart(){
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }


    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }
    public void removeItem(String itemName) {
        cartItems.remove(itemName);
    }
    public void modifyItem(ItemToPurchase item) {
        //TODO:FINISH THIS
    }
    public int getNumItemsInCart() {

        for (int i = 0; i < cartItems.size(); i++) {
            numOfItems = cartItems.get(i).getQuantity();
            totalCost += cartItems.get(i).getTotal();
        }
        return numOfItems;
    }
    public int getCostOfCart() {
        return totalCost;
    }
    public void printTotal() {
        System.out.printf("%s's Shopping Cart - %s%n", getCustomerName(), getDate());
        System.out.printf("Number of Items: %d%n", getNumItemsInCart());

            for (int i = 0; i < cartItems.size(); i++) {
                if (cartItems.get(i).getQuantity() == 0) {
                    System.out.println("SHOPPING CART IS EMPTY");
                }
                else {
                cartItems.get(i).printItemCost();
                for(int j = 1; j < cartItems.size();j++) {
                    cartItems.get(j).printItemCost();
                }
                System.out.println();
                for(int j = 1; j < cartItems.size();j++) {
                    itemTotal += cartItems.get(j).getTotal();
                }
                System.out.printf("Total: $%d%n", getCostOfCart());
                break;}
        }
    }

    public void printDescriptions() {
        System.out.printf("%s's Shopping Cart - %s", getCustomerName(), getDate());
        System.out.println();
        for(int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemDescription();
            System.out.println();
        }

    }





}

