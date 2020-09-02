package Java_Assignment_in_Inheritance.Exercise_One;

import lombok.Data;

@Data
public class StoreAccount extends Account{

    private String storeName;
    private Category accountCategory;


    public StoreAccount(String owner, Double balance, int numberOfTransactions,String storeName, Category accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.accountCategory=accountCategory;
        this.storeName=storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Category getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(Category accountCategory) {
        this.accountCategory = accountCategory;
    }

    public void changeCategory(Category newCategory){
        this.accountCategory=newCategory;
        System.out.println("\nThe new category of Store Account is:"+accountCategory);
    }
    @Override
    public String toString() {
        return "Store" +super.toString()+
                ", storeName='" + storeName + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                '}';
    }
}
