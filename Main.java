abstract class Product {
    protected String name;
    public Product(String name) { this.name = name; }
    public abstract double getPrice();
    public abstract String getDescription();
}

interface Discountable { double getDiscount(); }

class Electronics extends Product implements Discountable {
    private double price;
    private String brand;
    public Electronics(String name, double price, String brand) {
        super(name); this.price = price; this.brand = brand;
    }
    public double getPrice() { return price; }
    public String getDescription() { return brand + " " + name; }
    public double getDiscount() { return price * 0.1; }
}

class Books extends Product {
    private double price;
    private String author;
    public Books(String name, double price, String author) {
        super(name); this.price = price; this.author = author;
    }
    public double getPrice() { return price; }
    public String getDescription() { return name + " by " + author; }
}

class Clothing extends Product implements Discountable {
    private double price;
    private String size;
    public Clothing(String name, double price, String size) {
        super(name); this.price = price; this.size = size;
    }
    public double getPrice() { return price; }
    public String getDescription() { return "Size " + size + " " + name; }
    public double getDiscount() { return price * 0.15; }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 1200, "Dell"),
            new Books("The Great Gatsby", 15, "F. Scott Fitzgerald"),
            new Clothing("T-Shirt", 25, "M")
        };
        
        for (Product p : products) {
            System.out.print(p.getDescription() + " - Price: " + p.getPrice());
            if (p instanceof Discountable) {
                System.out.println(" - Discount: " + ((Discountable) p).getDiscount());
            } else {
                System.out.println();
            }
        }
    }
}