package com.r;

public class CoffeeMachine {

    public boolean button;
    public enum Loc {L0, L1, L2, L3, L4};
    public int x, y, g;
    public Loc location = Loc.L0;
    public boolean grinding, brewing, coffee;

    public CoffeeMachine() {}

    public void button() {
        switch (location) {
            case L0:
                if (x == 4) {
                    button = true;
                    location = Loc.L1;
                    break;
                }
            default:
                break;
        }
    }

    void grinding(){
        switch (location) {
            case L1:
                grinding = true;
                location = Loc.L2;
                break;
            default:
                break;
        }
    }

    void brewing() {
        switch (location) {
            case L2:
                brewing = true;
                location = Loc.L3;
                break;
            default:
                break;
        }
    }

    void coffee() {
        switch (location) {
            case L3:
                coffee = true;
                location = Loc.L4;
                break;
            default:
                break;
        }
    }

    public void wait (int delay) {
        while (delay >= 0) {
            switch (this.location) {
                case L0:
                    if (x == 4) {
                        return;
                    }
                case L1:
                    if (x == 4) {
                        grinding();
                        return;
                    }
                    break;
                case L2:
                    if (x == 9){
                        brewing();
                        return;
                    }
                    break;
                case L3:
                    if (y == 5){
                        coffee();
                        return;
                    }
                    break;
                default:
                    break;
            }
            if (delay > 0) {
                x++;
                y++;
                g++;
            }
            delay--;
        }
    }
}
