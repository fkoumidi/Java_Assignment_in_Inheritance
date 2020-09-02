package Java_Assignment_in_Inheritance.Exercise_One;

public class Account {

    private String owner;
    private Double balance;
    private int numberOfTransactions;

    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }


    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public void withdraw(double n){
        balance -=n;
        numberOfTransactions++;
        System.out.println("A withdrawal of "+n+" euros was made and your balance is "+balance+" euros\n"+
                "Number of Transactions:"+numberOfTransactions);
    }

    public void deposit(double n){
        balance +=n;
        numberOfTransactions++;
        System.out.println("A deposit of "+n+" euros was made and your balance is "+balance+" euros\n"+
                "Number of Transactions:"+numberOfTransactions);
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }
}
