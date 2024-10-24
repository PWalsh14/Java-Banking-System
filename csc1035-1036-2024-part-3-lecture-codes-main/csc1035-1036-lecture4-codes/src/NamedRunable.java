import java.lang.Runnable;
public class NamedRunable implements Runnable {
    private String name;
    public NamedRunable(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("Greeting from thread '" + name + "'!");
    }
}
