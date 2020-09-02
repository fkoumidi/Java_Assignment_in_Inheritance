package Java_Assignment_in_Inheritance.Exercise_One;

import Java_Assignment_in_Inheritance.Exercise_One.Account;
import Java_Assignment_in_Inheritance.Exercise_One.StoreAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Fotis", 1000d, 15);
        System.out.println(account.toString());


        StoreAccount sa = new StoreAccount("fotis", 100d, 35, "paok", Category.premium);
        System.out.println(sa);
    }
}
