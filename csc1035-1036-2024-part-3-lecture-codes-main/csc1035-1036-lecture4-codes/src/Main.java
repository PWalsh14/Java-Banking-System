import com.sun.jdi.event.ThreadDeathEvent;

public class Main {
    public static void main(String[] args) {
    NamedThreadSuper fred = new NamedThreadSuper("Simon");
    fred.start();

//        try {
//            Thread.sleep(10);  // Attempts to pause the current thread for 10 milliseconds
//        } catch (InterruptedException e) {
//            // This block executes if the sleep was interrupted
//            e.printStackTrace();  // Print the stack trace or handle the interruption appropriately
//        }
    System.out.println("Thread has been started");


        // run() would execute the run() method in the same thread,
        // rather than created a new thread
//    fred.run();


    // Small delay to allow the new thread some time to start


        NamedRunable greeting = new NamedRunable("Peter");
        Thread greatingsThread = new Thread(greeting);
        greatingsThread.start();

    }
}