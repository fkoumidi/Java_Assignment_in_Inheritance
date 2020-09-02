package Java_Assignment_in_Inheritance.Exercise_One;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Account account = new Account("Fotis", 1000d, 15);
        account.deposit(300);
        account.withdraw(500);
        System.out.println("\n"+account.toString());

        System.out.println("\n\nTask2");
        StoreAccount sa = new StoreAccount("George", 2000d, 24, "Code.Hub", Category.mid);
        sa.withdraw(600);
        sa.deposit(200);
        sa.changeCategory(Category.premium);
        System.out.println("\n"+sa);
    }
}
