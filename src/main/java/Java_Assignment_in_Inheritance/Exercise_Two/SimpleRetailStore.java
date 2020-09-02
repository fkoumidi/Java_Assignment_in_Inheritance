package Java_Assignment_in_Inheritance.Exercise_Two;

import lombok.Data;

import java.util.List;

@Data
public class SimpleRetailStore implements IStore {
    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore(double totalBuyBalance, double totalSellBalance) {
        this.totalBuyBalance = totalBuyBalance;
        this.totalSellBalance = totalSellBalance;
    }

    public SimpleRetailStore() {

    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance-totalBuyBalance;
    }

    @Override
    public List<Product> getInventory() {
        return null;
    }

    @Override
    public List<Product> reset() {
        return null;
    }




}
