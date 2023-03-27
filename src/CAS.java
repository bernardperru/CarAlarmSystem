import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Thread.sleep;

public class CAS {

     public boolean armed = false;
     public boolean flash = false;
     public boolean closed = false;
     public boolean locked = false;
     public boolean sound = false;

     public int c,d = 0;


    private enum Loc { L0, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15 };
    private Loc location;
    public CAS() {
        this.location = Loc.L0;
    }

     public void lock() {
        switch (this.location) {
            case L1:
                locked = true;
                this.location = Loc.L3;
                double timestamp = System.currentTimeMillis();
                //await input for <2 seconds otherwise call armedOn()!
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
                soundOff();
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
                //must delay for 2 seconds to trigger armedOn();
                break;
            case L0:
                closed = true;
                this.location = Loc.L1;
                break;
            case L7:
                closed = true;
                this.location = Loc.L5;
                armedOn();
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
                flashOn();
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
                double timestamp = System.currentTimeMillis();
              //delay for 3 seconds
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
                flashOff();
                break;
            case L11:
                sound = false;
                this.location = Loc.L14;
                flashOff();
                break;
            case L10:
                sound = false;
                this.location = Loc.L12;

                double timestamp = System.currentTimeMillis();
                //delay for 27 seconds
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
                soundOn();
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

    void wait (int delay){
        c = delay;
        d = delay;
        switch (this.location){
            case L3:
                if(c == 2){
                    armedOn();
                }
                break;
            case L10:
                if (d == 3){
                    soundOff();
                }
                break;
            case L12:
                if (d == 30){
                    soundOff();
                }
                break;
        }
    }
}
