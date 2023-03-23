public class Main {
    public static void main(String[] args) {

        Data data = new Data();

        Thread cas = new Thread(new CAS(data));
        Thread tester = new Thread(new Tester(data));

        tester.start();
        cas.start();
    }
}