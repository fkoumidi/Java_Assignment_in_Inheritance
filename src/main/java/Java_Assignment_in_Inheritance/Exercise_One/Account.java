package Java_Assignment_in_Inheritance.Exercise_One;

import lombok.Data;

@Data
public class Account {

    private String owner;
    private Double balance;
    private int numberOfTransactions;

    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }


    public void withdraw(double n){
        balance -=n;
        numberOfTransactions++;
        System.out.println("\nA withdrawal of "+n+" euros was made and your balance now is "+balance+" euros\n"+
                "Number of Transactions:"+numberOfTransactions);
    }

    public void deposit(double n){
        balance +=n;
        numberOfTransactions++;
        System.out.println("\nA deposit of "+n+" euros was made and your balance now is "+balance+" euros\n"+
                "Number of Transactions:"+numberOfTransactions);
    }

    @Override
    public String toString() {
        return "Account:" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions
                ;
    }
}
