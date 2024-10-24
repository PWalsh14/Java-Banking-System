import overDraftExample.*;
import overDraftExampleAtomic.*;
import webRequestsProcessing.ClientRequest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List.*;
public class Main {
    public static void main(String[] args) {


//        Create a fixed thread pool with 4 threads
//        ExecutorService executor = Executors.newFixedThreadPool(4);
//
//        for (int i = 1; i <= 10; i++) {
//            // Create a new client request
//            ClientRequest request = new ClientRequest(i);
//            // Submit the request to the executor
//            executor.submit(request);
//        }

        // Shut down the executor gracefully
        // otherwise,the executor will remain live indefinitely
//        executor.shutdown();



//        BankAccount sharedAccount = new BankAccount(1000); // Shared account with $1000
//        BankAccountSynchronized sharedAccount = new BankAccountSynchronized(1000); // Shared account with $1000
//        WithdrawalThread t1 = new WithdrawalThread(sharedAccount, 500, "ATM1");
//        WithdrawalThread t2 = new WithdrawalThread(sharedAccount, 750, "ATM2");
//
//        t1.start();
//        t2.start();

//
//


        BankAccountAtomic account = new BankAccountAtomic(100);

        // Two threads attempting to withdraw $100 simultaneously
        Thread atm1 = new Thread(() -> account.withdraw(100), "ATM1");
        Thread atm2 = new Thread(() -> account.withdraw(100), "ATM2");

        atm1.start();
        atm2.start();

        // The join() method ensures that the main thread
        // (or the thread calling join()) waits
        // until atm1 and atm2 have finished executing.
//        try {
//            atm1.join();
//            atm2.join();
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }

        // Check final balance
        System.out.println("Final balance: " + account.getBalance());






    }
}
