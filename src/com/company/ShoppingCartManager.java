package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartManager {


    public static void printMenu(ShoppingCart shoppingCart) {
        Scanner scnr = new Scanner(System.in);
        char option;String itemName; String itemDescription;
        int itemPrice; int itemQuantity;
        System.out.println("MENU\na - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit\n\nChoose an option");
        option = scnr.nextLine().charAt(0);

        switch (option){
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                itemName = scnr.nextLine();
                System.out.println("Enter the item description:");
                itemDescription = scnr.nextLine();
                System.out.println("Enter the item price:");
                itemPrice = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                itemQuantity = scnr.nextInt();
                ItemToPurchase item = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
                item.setTotal(itemPrice*itemQuantity);
                shoppingCart.addItem(item);
                printMenu(shoppingCart);

                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                itemName = scnr.nextLine();
                shoppingCart.removeItem(itemName);
                printMenu(shoppingCart);
                break;
            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                itemName = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                itemQuantity = scnr.nextInt();
                ItemToPurchase newItemQuantity = new ItemToPurchase();
                    newItemQuantity.setName(itemName);
                    newItemQuantity.setQuantity(itemQuantity);
                    shoppingCart.modifyItem(newItemQuantity);
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                shoppingCart.printDescriptions();
                printMenu(shoppingCart);
                break;
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                shoppingCart.printTotal();
                printMenu(shoppingCart);
                break;
            default:
                printMenu(shoppingCart);
                option = scnr.next().charAt(0);
                break;
        }


    }




    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String customerName;
        String date;

        System.out.println("Enter Customer's Name:");
        customerName = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        date = scnr.nextLine();

        System.out.println();
        System.out.printf("Customer Name: %s%n", customerName);
        System.out.printf("Today's Date: %s%n", date);

        ShoppingCart cart = new ShoppingCart(customerName, date);

        printMenu(cart);




    }
}