import static java.lang.Thread.sleep;

public class Tester implements Runnable {
    Data data;
    public Tester(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        data.send("hejejejej");
    }
}
