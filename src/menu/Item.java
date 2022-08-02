package menu;

public class Item {
    String name;
    double price;
    int category;
    String description;
//    boolean isNew = checkNew();

    /**
     *
     * @param name The name of the item.
     * @param price The price of the item.
     * @param category 1, 2, or 3, representing Appetizer, Main Course, and Desert respectively.
     * @param description An optional description of the item.
     */
    public Item(String name, double price, int category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public Item(String name, double price, int category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = "A very nice " + checkCategory();
    }
    public String checkCategory() {
        if (this.category == 1) return "Appetizer";
        if (this.category == 2) return "Main Course";
        if (this.category == 3) return "Desert";
        return "Invalid Category";
    }
    //I cannot check the computer's date, so isNew is currently useless.
}
