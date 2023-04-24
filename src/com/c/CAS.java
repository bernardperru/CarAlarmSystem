package com.c;

public class CAS {
     public boolean armed;
     public boolean flash;
     public boolean closed;
     public boolean locked;
     public boolean sound;
     public int c,d, g;
     private enum Loc { L0, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16 };
     private Loc location;
     public CAS() {
        location = Loc.L0;
    }

     public void lock() {
        switch (location) {
            case L1:
                locked = true;
                location = Loc.L3;
                break;
            case L0:
                locked = true;
                location = Loc.L2;
            default:
                break;
        }
    }
     public void unlock() {
        switch (location) {
            case L3:
                locked = false;
                location = Loc.L1;
                break;
            case L2, L7:
                locked = false;
                location = Loc.L0;
                break;
            case L12:
                locked = false;
                location = Loc.L11;
                break;
            case L10:
                locked = false;
                location = Loc.L11;
                break;
            case L4:
                locked = false;
                location = Loc.L6;
                break;
            default:
                break;
        }
    }
     public void close() {
        switch (location) {
            case L2:
                closed = true;
                location = Loc.L3;
                break;
            case L0:
                closed = true;
                location = Loc.L1;
                break;
            case L7:
                closed = true;
                location = Loc.L5;
            default:
                break;
        }
    }
     public void open() {
        switch (location) {
            case L1:
                closed = false;
                location = Loc.L0;
                break;
            case L3:
                closed = false;
                location = Loc.L2;
                break;
            case L4:
                closed = false;
                location = Loc.L8;
            default:
                break;
        }
    }
     void armedOn() {
        switch (location) {
            case L3:
                armed = true;
                location = Loc.L4;
                break;
            case L5:
                armed = true;
                location = Loc.L4;
                break;
            default:
                break;
        }
    }
     void armedOff() {
        switch (location) {
            case L8:
                armed = false;
                location = Loc.L9;
                break;
            case L6:
                armed = false;
                location = Loc.L1;
                break;
            default:
                break;
        }
    }
     void soundOn() {
        switch (location) {
            case L15:
                sound = true;
                location = Loc.L10;
                break;
            default:
                break;
        }
    }
     void soundOff() {
        switch (location) {
            case L12:
                sound = false;
                location = Loc.L13;
                break;
            case L11:
                sound = false;
                location = Loc.L14;
                break;
            case L10:
                sound = false;
                location = Loc.L12;
                break;
            default:
                break;
        }
    }
     void flashOn() {
        switch (location) {
            case L9:
                flash = true;
                location = Loc.L15;
                break;
            default:
                break;
        }
    }
     void flashOff() {
        switch (location) {
            case L13:
                flash = false;
                location = Loc.L7;
                break;
            case L14:
                flash = false;
                location = Loc.L0;
                break;
            default:
                break;
        }
    }
    public void wait (int delay){
        while (delay >= 0) {
            if (delay > 0) {
                c++;
                d++;
                g++;
            }
            delay--;

            switch (location) {
                case L3 -> {
                    if (c == 20) {
                        armedOn();
                    }
                }
                case L10 -> {
                    if (d == 30) {
                        soundOff();
                    }
                }
                case L12 -> {
                    if (d == 300) {
                        soundOff();
                    }
                }
                case L8 -> {
                    if (d == 0) {
                        armedOff();
                    }
                }
                case L6 -> {
                    if (d == 0) {
                        armedOff();
                    }
                }
                case L9 -> {
                    if (d == 0) {
                        flashOn();
                    }
                }
                case L15 -> {
                    if (d == 0) {
                        soundOn();
                    }
                }
                case L11 -> {
                    if (d == 0) {
                        soundOff();
                    }
                }
                case L14 -> {
                    if (d == 0) {
                        flashOff();
                    }
                }
                case L13 -> {
                    if (d == 300) {
                        flashOff();
                    }
                }
                case L5 -> {
                    if (d == 0) {
                        armedOn();
                    }
                }
            }
            if (delay == 0) {
                break;
            }
        }
    }
}
