package Java_Assignment_in_Inheritance.Exercise_Two;

import lombok.Data;
import java.util.List;

@Data
public class InventoryRetailStore extends SimpleRetailStore implements IStore{
    private List<Product> products;

    public InventoryRetailStore(double totalBuyBalance, double totalSellBalance,List<Product> products) {
        super(totalBuyBalance,totalSellBalance);
        this.products = products;
    }

    public InventoryRetailStore() {

    }

    public List<Product> getInventory(Product product) {
        products.add(product);
        return products;
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }
    public List<Product> reset(Product product) {
        products.remove(product);
        return products;
    }
}
