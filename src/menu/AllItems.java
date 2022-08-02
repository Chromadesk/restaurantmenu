package menu;

import java.util.ArrayList;

public class AllItems {
    static Item chicken = new Item("Chicken", 8.99, 2);
    static Item beef = new Item("Beef", 10.99, 2);
    static Item human = new Item("Ryan", 500.00, 1, "Our staff member, Ryan, fully cooked.");
    static Item cake = new Item("Cake", 10.99, 3);

    public static ArrayList<Item> menuItems = new ArrayList<>() {
        {
            add(chicken);
            add(beef);
            add(human);
            add(cake);
        }
    };
}
