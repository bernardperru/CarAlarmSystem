public class Main {
    public static void main(String[] args) {
        Mim mim = new Mim();

        Runnable cas = new ThreadCAS(mim);
        Runnable user = new ThreadUser(mim);

        Thread casThread = new Thread(cas);
        Thread userThread = new Thread(user);

        casThread.start();
        userThread.start();
    }
}