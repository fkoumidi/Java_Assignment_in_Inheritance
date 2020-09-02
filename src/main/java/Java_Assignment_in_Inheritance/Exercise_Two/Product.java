package Java_Assignment_in_Inheritance.Exercise_Two;

public class Product {

    private int id;
    private String name;
    private  double priceWhenSell;
    private double priceWhenBuy;

    public Product(int id, String name, double priceWhenSell, double priceWhenBuy) {
        this.id = id;
        this.name = name;
        this.priceWhenSell = priceWhenSell;
        this.priceWhenBuy = priceWhenBuy;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    public void setPriceWhenSell(double priceWhenSell) {
        this.priceWhenSell = priceWhenSell;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        this.priceWhenBuy = priceWhenBuy;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceWhenSell=" + priceWhenSell +
                ", priceWhenBuy=" + priceWhenBuy +
                '}';
    }
}
