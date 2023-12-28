public class Account {
    int accountId;
    String name;
    double balance;

    public Account(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void printReceipt() {
        System.out.println("Account id: " + accountId);
        System.out.println("Name: " + name);
        System.out.printf("Account Balance: Rs.%.2f\n\n", balance);
    }

    public void transferAmount(Account receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
        } else {
            System.out.println("Insufficient funds for transfer.\n");
        }
    }

    public static void main(String[] args) {
        Account accountA = new Account(12344, "Account A", 5000.0);
        Account accountB = new Account(56789, "Account B", 2500.0);

        System.out.println("Initial State:");
        accountA.printReceipt();
        accountB.printReceipt();

        
        accountA.transferAmount(accountB, 1500.0);
        System.out.println("After transferring 1500 from Account A to B:");
        accountA.printReceipt();
        accountB.printReceipt();

        
        accountB.transferAmount(accountA, 3000.0);
        System.out.println("After transferring 3000 from Account B to A:");
        accountA.printReceipt();
        accountB.printReceipt();
    }
}
