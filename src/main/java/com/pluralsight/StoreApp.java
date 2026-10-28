package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf(" %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
// this method loads product objects into inventory
        inventory.add(new Product(1, "Apple", 10.00));
        inventory.add(new Product(2, "Banana", 12.00));
        inventory.add(new Product(3, "Cheese", 12.00));
        inventory.add(new Product(4, "Coffee", 12.00));
        inventory.add(new Product(5, "Donut", 12.00));
// and its details are not shown
        return inventory;
    }
}
