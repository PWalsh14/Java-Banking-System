package overDraftExample;

public class WithdrawalThread extends Thread {
    private BankAccountSynchronized account;
    private int amount;

    public WithdrawalThread(BankAccountSynchronized account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
