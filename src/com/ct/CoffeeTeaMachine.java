package com.ct;

public class CoffeeTeaMachine {

        public enum Loc {L0, L1, L2, L3, L4, L5};
        public int x, g;
        public Loc location = Loc.L0;
        public boolean coin, pouringCoffee, pouringTea, coffee, tea;
        public CoffeeTeaMachine() {}

        public void pourCoffee() {
            if (this.location == Loc.L2) {
                pouringCoffee = true;
                this.location = Loc.L5;
            }
        }

        public void pourTea() {
            if (this.location == Loc.L3) {
                pouringTea = true;
                this.location = Loc.L4;
            }
        }

    public void coin() {
        if (this.location == Loc.L0) {
            coin = true;
            this.location = Loc.L1;
        }
    }

    public void refund() {
        if (this.location == Loc.L1) {
            coin = false;
            this.location = Loc.L0;
        }
    }

    public void coffee() {
        if (this.location == Loc.L1 && x < 5) {
            coffee = true;
            this.location = Loc.L2;
        }
    }

    public void tea() {
        if (this.location == Loc.L1 && x < 5) {
            tea = true;
            this.location = Loc.L3;
        }
    }

    public void done() {
        if (this.location == Loc.L5 || this.location == Loc.L4) {
            pouringCoffee = false;
            pouringTea = false;
            coffee = false;
            coin = false;
            tea = false;
            this.location = Loc.L0;
        }
    }
        public void wait (int delay) {

            while (delay >= 0) {

                switch (this.location) {
                    case L1:
                        if(x == 5) {
                            refund();
                            return;
                        }
                        break;
                    case L2:
                        if (x == 9/*x < 10 && x > 5*/) {
                            pourCoffee();
                            return;
                        }
                        break;
                    case L3:
                        if (x == 4/*x < 5 && x >= 3*/) {
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
                        if (x == 10/*x <= 10 && x >= 5*/) {
                            done();
                            return;
                        }
                        break;
                    default:
                        break;
                }
                if (delay > 0) {
                    x++;
                    g++;
                }
                delay--;
        }
    }
}
