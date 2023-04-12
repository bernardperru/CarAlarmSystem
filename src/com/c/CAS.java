package com.c;

public class CAS {
     public boolean armed = false;
     public boolean flash = false;
     public boolean closed = false;
     public boolean locked = false;
     public boolean sound = false;
     public int c,d, g = 0;
     private enum Loc { L0, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16 };
     private Loc location;
     public CAS() {
        this.location = Loc.L0;
    }
     public void lock() {
        switch (this.location) {
            case L1:
                locked = true;
                this.location = Loc.L3;
                break;
            case L0:
                locked = true;
                this.location = Loc.L2;
            default:
                break;
        }
    }
     public void unlock() {
        switch (this.location) {
            case L3:
                locked = false;
                this.location = Loc.L1;
                break;
            case L2, L7:
                locked = false;
                this.location = Loc.L0;
                break;
            case L12:
                locked = false;
                this.location = Loc.L11;
                break;
            case L10:
                locked = false;
                this.location = Loc.L16;
                break;
            case L4:
                locked = false;
                this.location = Loc.L6;
                break;
            default:
                break;
        }
    }
     public void close() {
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
     public void open() {
        switch (this.location) {
            case L1:
                closed = false;
                this.location = Loc.L0;
                break;
            case L3:
                closed = false;
                this.location = Loc.L2;
                break;
            case L4:
                closed = false;
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
                armed = true;
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
            case L16:
                sound = false;
                this.location = Loc.L11;
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
    public void wait (int delay){

        while (delay >= 0) {
            if (delay > 0) {
                c++;
                d++;
                g++;
            }
            delay--;

            switch (this.location) {
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
                case L16 -> {
                    if (d == 0) {
                        soundOff();
                    }
                }
                case L0 -> {
                    break;
                }
            }
            if (delay == 0) {
                break;
            }
        }
    }
}
