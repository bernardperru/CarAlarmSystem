

public class User {
    Mim mim;
    public User(Mim mim) {
        this.mim = mim;
    }

    public void open() {
        mim.write("heyyayayaya");
    }

    public void close() {
        mim.write("done");
    }

    public void lock() {

    }

    public void unlock() {

    }
}
