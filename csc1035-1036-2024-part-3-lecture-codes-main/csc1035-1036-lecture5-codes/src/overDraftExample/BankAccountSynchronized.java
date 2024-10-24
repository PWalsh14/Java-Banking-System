package overDraftExample;


public class BankAccountSynchronized {
    private int balance;

    public BankAccountSynchronized(int initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money without synchronization
    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw $" + amount);
            try {
                Thread.sleep(100); // Simulate the time taken for transaction processing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal of $" + amount + ", remaining balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw $" + amount + " due to insufficient funds.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

