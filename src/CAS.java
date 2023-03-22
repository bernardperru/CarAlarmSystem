import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class CAS{



     boolean armed = false;
     boolean flash = false;

     boolean closed = false;

     boolean locked = false;

     boolean sound = false;


    private enum Loc { L0, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15 };
    private Loc location;

    private Mim mim;
    public CAS(Mim mim) {
        location = Loc.L0;
        this.mim = mim;
    }


    public void readInput() {
        while (true) {
            String temp = mim.read();
            if (temp != null) {
                switch (temp) {
                    case "open":
                        open();
                        break;
                    case "close":
                        close();
                        break;
                    case "lock":
                        lock();
                        break;
                    case "unlock":
                        unlock();
                        break;

                }

                if (temp.equals("done")) {
                    break;
                }
            }

        }
    }

     public void lock() {
        switch (this.location) {
            case L1:
                locked = true;
                this.location = Loc.L3;
                //await input for <2 seconds otherwise call armedOn()!
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                try {
                    if (br.ready()) {
                        System.out.println(br.readLine());
                    } else {
                        Thread.sleep(2000);
                        if (br.ready()) {
                            System.out.println(br.readLine());
                        } else {
                            System.out.println("armedOn()");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case L0:
                locked = true;
                this.location = Loc.L2;
            default:
                break;
        }
    }
     void unlock() {
        switch (this.location) {
            case L3:
                locked = false;
                this.location = Loc.L1;
                break;
            case L2, L7:
                locked = false;
                this.location = Loc.L0;
                break;
            case L12, L10:
                locked = false;
                this.location = Loc.L11;
                break;
            case L4:
                locked = false;
                this.location = Loc.L6;
                break;
            default:
                break;
        }
    }

     void close() {
        switch (this.location) {
            case L2:
                closed = true;
                this.location = Loc.L3;
                break;
            case L0:
                closed = true;
                this.location = Loc.L1;
                break;
            case L7:
                closed = true;
                this.location = Loc.L5;
            default:
                break;
        }
    }

     void open() {
        switch (this.location) {
            case L1:
                closed = false;
                locked = false;
                this.location = Loc.L0;
                break;
            case L3:
                closed = false;
                locked = false;
                this.location = Loc.L2;
                break;
            case L4:
                closed = false;
                locked = false;
                this.location = Loc.L8;
            default:
                break;
        }
    }

     void armedOn() {
        switch (this.location) {
            case L3:
                armed = true;
                this.location = Loc.L4;
                break;
            case L5:
                closed = true;
                this.location = Loc.L4;
                break;
            default:
                break;
        }
    }

     void armedOff() {
        switch (this.location) {
            case L8:
                armed = false;
                this.location = Loc.L9;
                break;
            case L6:
                armed = false;
                this.location = Loc.L1;
                break;
            default:
                break;
        }
    }

     void soundOn() {
        switch (this.location) {
            case L15:
                sound = true;
                this.location = Loc.L10;
                break;
            default:
                break;
        }
    }

     void soundOff() {
        switch (this.location) {
            case L12:
                sound = false;
                this.location = Loc.L13;
                break;
            case L11:
                sound = false;
                this.location = Loc.L14;
                break;
            case L10:
                sound = false;
                this.location = Loc.L12;
                break;
            default:
                break;
        }
    }

     void flashOn() {
        switch (this.location) {
            case L9:
                flash = true;
                this.location = Loc.L15;
                break;
            default:
                break;
        }
    }

     void flashOff() {
        switch (this.location) {
            case L13:
                flash = false;
                this.location = Loc.L7;
                break;
            case L14:
                flash = false;
                this.location = Loc.L0;
                break;
            default:
                break;
        }
    }


}
