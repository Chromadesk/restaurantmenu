package menu;
import java.util.Scanner;

public class UserInput {

    public static void addNewItem() {
        boolean done = false;

        while(!done) {
            System.out.println("Creating new menu item");
            Scanner input = new Scanner(System.in);
            System.out.println("Item Name:");
            String name = input.nextLine();

            System.out.println("Item Price:");
            double price = input.nextDouble();

            System.out.println("Item Category (1 - Appetizer, 2 - Main Course, 3 - Desert):");
            int category = input.nextInt();

            System.out.println("Item Description:");
            String description = input.next();

            System.out.println("Done? Y/N");
            String finish = input.next();

            if (finish.equalsIgnoreCase("y")) {
                done = true;
                input.close();
            }
            if (description.length() == 0) {
                Item newItem = new Item(name,price,category);
                AllItems.menuItems.add(newItem);
                return;
            }
            Item newItem = new Item(name,price,category,description);
            AllItems.menuItems.add(newItem);
        }

    }

}
