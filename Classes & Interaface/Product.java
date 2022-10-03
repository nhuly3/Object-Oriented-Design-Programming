public final class Product {
    //Variables
    private String name;
    private String description;
    private double price;
    private int maximumQuantity;
/**
 * 
 * @param name
 * @param description
 * @param price
 * @param maximumQuantity
 */
    public Product(String name, String description, double price, int maximumQuantity) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
        this.maximumQuantity = maximumQuantity;
    }

    // Getters for all attributes
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + "\nDescription: " + description + "\nPrice: " + price + "\nMaximum Quantity: "
                + maximumQuantity;
    }
}