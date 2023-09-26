import java.util.ArrayList;

public class InventoryManagementSystem {
    private ArrayList<Item> inventory;

    // Constructor to initialize the inventory
    public InventoryManagementSystem() {
        this.inventory = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        inventory.add(item);
    }

    // Method to generate and display a report of all items in the inventory
    public void generateInventoryReport() {
        System.out.println("Inventory Report:");
        System.out.println("-----------------------------------------");
        System.out.printf("%-20s %-15s %-10s %-10s\n", "Item Name", "Category", "Quantity", "Price");

        for (Item item : inventory) {
            System.out.printf("%-20s %-15s %-10d %-10.2f\n", item.getName(), item.getCategory(), item.getQuantity(), item.getPrice());
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Add sample items to the inventory
        inventorySystem.addItem(new Item("Product1", "Electronics", 50, 299.99));
        inventorySystem.addItem(new Item("Product2", "Groceries", 100, 2.49));
        inventorySystem.addItem(new Item("Product3", "Clothing", 25, 39.99));

        // Generate and display the inventory report
        inventorySystem.generateInventoryReport();
    }
}

class Item {
    private String name;
    private String category;
    private int quantity;
    private double price;

    public Item(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters for item attributes
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;   
    }
}


