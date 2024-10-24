import java.lang.Thread;
public class NamedThread extends Thread {
    // The name of this thread
    private String name;

    // Constructor which gives name to the thread
    public NamedThread(String name) {
        this.name = name;
    }

    // the run method prints a message
    public void run() {
        System.out.println("Greeting from thread '" + name + "'!");
    }


}
