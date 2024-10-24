package webRequestsProcessing;

public class ClientRequest implements Runnable {
    private final int requestId;

    public ClientRequest(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        System.out.println("Processing request " + requestId + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate time taken to process request
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
        System.out.println("Completed request " + requestId + " by " + Thread.currentThread().getName());
    }
}