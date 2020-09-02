package Java_Assignment_in_Inheritance.Exercise_Two;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore implements IStore{
    private List<Product> products;

    public InventoryRetailStore(double totalBuyBalance, double totalSellBalance, List<Product> products) {
        super(totalBuyBalance,totalSellBalance);
        this.products=products;
    }

    public InventoryRetailStore() {
        products= new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
        products.add(product);
    }

    @Override
    public void sell(Product product) {
        if(products.contains(product)){
        totalSellBalance += product.getPriceWhenSell();
        products.remove(product);}
        else{
            System.out.println("Product , "+product.getName()+"  ,does not exist");
        }
    }

    public List<Product> getInventory() {
        for(Product product: products){
            product.toString();
        }
        return products;
    }

    public void reset() {
        products.clear();
    }


}
