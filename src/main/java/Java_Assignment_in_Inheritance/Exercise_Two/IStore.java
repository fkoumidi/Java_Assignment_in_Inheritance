package Java_Assignment_in_Inheritance.Exercise_Two;

import java.util.List;

public interface IStore {
    void buy (Product product);
    void sell (Product product);
    double getRevenue();
    List<Product> getInventory();
    List<Product> reset();
}
