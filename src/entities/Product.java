package entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

}