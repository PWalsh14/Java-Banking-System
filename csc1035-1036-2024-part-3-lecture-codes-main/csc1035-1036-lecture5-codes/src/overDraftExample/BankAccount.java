package overDraftExample;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        System.out.println(System.currentTimeMillis() + ": Account initialized with balance $" + initialBalance);
    }

    public void withdraw(int amount) {
        System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread().getName() + " is trying to withdraw $" + amount);

        if (amount <= balance) {
            System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread().getName() + " checks balance sufficient: $" + balance);

            // Simulating time delay in processing the transaction
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Changing the balance
            balance -= amount;
            System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread().getName() + " completed withdrawal of $" + amount + ", remaining balance: $" + balance);
        } else {
            System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread().getName() + " failed to withdraw $" + amount + " due to insufficient funds, current balance: $" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}



