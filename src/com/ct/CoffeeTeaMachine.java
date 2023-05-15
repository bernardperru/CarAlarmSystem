package com.ct;

public class CoffeeTeaMachine {

        public enum Loc {L0, L1, L2, L3, L4, L5};
        public int x, g;
        public Loc location = Loc.L0;
        public boolean coin, pouringCoffee, pouringTea, coffee, tea;
        public CoffeeTeaMachine() {}

        public void pourCoffee() {
                pouringCoffee = true;
                this.location = Loc.L5;
        }

        public void pourTea() {
                pouringTea = true;
                this.location = Loc.L4;
        }

    public void refund() {
            coin = false;
            this.location = Loc.L0;
    }

    public void coin() {
        switch(this.location) {
            case L0:
                coin = true;
                this.location = Loc.L1;
                break;
            default:
                break;
        }
    }
    public void coffee() {
        switch(this.location) {
            case L1:
                coffee = true;
                this.location = Loc.L2;
                break;
            default:
                break;
        }
    }

    public void tea() {
        switch(this.location) {
            case L1:
                tea = true;
                this.location = Loc.L3;
            default:
                break;
        }
    }

    public void done() {
        pouringTea = false;
        tea = false;
        pouringCoffee = false;
        coffee = false;
        coin = false;
        this.location = Loc.L0;
    }

    public void wait (int delay) {
        while (delay >= 0) {
            switch (this.location) {
                case L1:
                    if((x <= 5) && (x >= 5)) {
                        refund();
                        return;
                    }
                    break;
                case L2:
                    if (x == 9) {
                        pourCoffee();
                        return;
                    }
                    break;
                case L3:
                    if (x == 4) {
                        pourTea();
                        return;
                    }
                    break;
                case L5:
                    if (x == 12) {
                        done();
                        return;
                    }
                    break;
                case L4:
                    if (x == 10) {
                        done();
                        return;
                    }
                    break;
                default:
                    break;
            }
            x++;
            g++;
            delay--;
    }
    }
}
