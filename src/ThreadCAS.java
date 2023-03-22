public class ThreadCAS implements Runnable{
    CAS cas;

    @Override
    public void run() {
        cas.readInput();
    }

    public ThreadCAS(Mim mim) {
        cas = new CAS(mim);
    }
}
