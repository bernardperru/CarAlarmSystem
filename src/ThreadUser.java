public class ThreadUser implements Runnable{
    public User user;
    @Override
    public void run() {
        user.open();
        user.close();
    }

    public ThreadUser(Mim mim) {
        user = new User(mim);
    }
}
