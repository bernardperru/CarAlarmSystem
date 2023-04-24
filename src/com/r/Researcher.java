package com.r;

import java.util.Objects;

public class Researcher {

    public enum Loc {L6, L7, L9, U0};
    public int x, g;
    public Loc location = Loc.L6;
    public boolean cof, tea;

    public int old, current;

    public Researcher() {
        current = 1;
    }
    public void cof() {
        if (this.location == Loc.L6) {
            cof = true;
            this.location = Loc.L9;
        }
    }

    public void tea() {
        if (this.location == Loc.L6) {
            if (x <= 15) {
                tea = true;
                this.location = Loc.L7;
            } else {
                tea = true;
                this.location = Loc.U0;
            }
        }
    }

    public void pub() {
        switch (this.location) {
            case L7:
                this.location = Loc.L6;
                old++;
                current++;
                tea = false;
                break;
            case L9:
                this.location = Loc.L6;
                old++;
                current++;
                cof = false;
                break;
            default:
                break;
        }

    }

    public void wait (int delay) {

        if (delay != 0) {
            x++;
            g++;
            delay--;
        }


        switch (this.location) {
            case L9:
                if (x == 4) {
                    pub();
                    return;
                }
            case L7:
                if (x == 8) {
                    pub();
                    return;
                }
            default:
                break;
        }
        if (delay > 0) {
            wait(delay);
        }
    }

}
