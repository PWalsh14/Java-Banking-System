import java.lang.Thread;
public class NamedThreadSuper extends Thread {
    // The name of this thread
    private String name;

    // Constructor which gives name to the thread
    public NamedThreadSuper(String name) {
        super(name);
    }

    // the run method prints a message
    public void run() {
        System.out.println("Greeting from thread '" + this.getName() + "'!");
    }


}
