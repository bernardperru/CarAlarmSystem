import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Mim {
    public Queue<String> actions;



    public Mim() {
       actions  = new PriorityQueue<>();
    }


    public void write(String act) {
        actions.add(act);
    }

    public String read() {
        String act = actions.peek();
        actions.remove();
        return act;
    }
}
