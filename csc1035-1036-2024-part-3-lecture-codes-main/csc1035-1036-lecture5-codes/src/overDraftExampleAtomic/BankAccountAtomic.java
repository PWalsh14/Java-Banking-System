package overDraftExampleAtomic;
import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountAtomic {
    private AtomicInteger balance;

    public BankAccountAtomic(int initialBalance) {
        this.balance = new AtomicInteger(initialBalance);
    }

    // Method to withdraw using atomic operations
    public void withdraw(int amount) {
        int currentBalance;
        do {
            currentBalance = balance.get();
            if (currentBalance < amount) {
                System.out.println(Thread.currentThread().getName() + " failed to withdraw £" + amount + " due to insufficient funds.");
                return;  // Exit the method
            }
        } while (!balance.compareAndSet(currentBalance, currentBalance - amount));

        System.out.println(Thread.currentThread().getName() + " completed withdrawal of £" + amount + ", remaining balance: $" + balance.get());
    }

    public int getBalance() {
        return balance.get();
    }
}

