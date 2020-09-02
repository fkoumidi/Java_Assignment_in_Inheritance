package Java_Assignment_in_Inheritance.Exercise_Two;

import lombok.Data;

@Data
public class SimpleRetailStore implements IStore {
    protected double totalBuyBalance;
    protected double totalSellBalance;

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




}
