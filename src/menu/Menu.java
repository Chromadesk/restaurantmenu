package menu;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    int lastEdited = 100;



    public static void main(String[] args) {
        //this should not occur in a normal program
        Scanner input = new Scanner(System.in);
        System.out.println("If you are an admin, input password now:");
        String password = input.nextLine();
        if (password.equals("admin")) {
            UserInput.addNewItem();
        }
        System.out.println("Today's Menu:");

        for (int i = 0; i < AllItems.menuItems.size(); i++) {
            Item item = AllItems.menuItems.get(i);
            System.out.println("[" + item.checkCategory() + "]" + item.name + " | $" + item.price + " | " + item.description);
        }
    }
}
