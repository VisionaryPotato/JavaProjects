package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartPrinter {



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String itemName; int itemPrice; int itemQuantity; int itemTotal;


        ItemToPurchase item1 = new ItemToPurchase();


        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        item1.setName(itemName);
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        item1.setPrice(itemPrice);
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        item1.setQuantity(itemQuantity);
        item1.setTotal(itemPrice * itemQuantity);
        System.out.println(item1.getName());


        ItemToPurchase item2 = new ItemToPurchase();


        System.out.println();
        scnr.nextLine();
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        item2.setName(itemName);
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        item2.setPrice(itemPrice);
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        item2.setQuantity(itemQuantity);
        item2.setTotal(itemPrice * itemQuantity);
        System.out.println();
        System.out.println("TOTAL COST");
        item1.printItemCost();
        item2.printItemCost();
        System.out.println();
        System.out.printf("Total: $%d%n" , (item1.getTotal() + item2.getTotal()));


    }
}
