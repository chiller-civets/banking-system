// BankSystem.java

public class BankSystem {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice", 1);
        Customer customer2 = new Customer("Bob", 2);

        // Create accounts
        Account account1 = new Account(101, customer1, 1000);
        Account account2 = new Account(102, customer2, 500);

        // Display initial balances
        System.out.println("Initial Balances:");
        System.out.println("Account " + account1.getAccountId() + ": $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountId() + ": $" + account2.getBalance());

        // Perform a transaction
        Transaction transaction = new Transaction(account1, account2, 300);
        transaction.execute();

        // Display updated balances
        System.out.println("\nUpdated Balances:");
        System.out.println("Account " + account1.getAccountId() + ": $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountId() + ": $" + account2.getBalance());
    }
}
