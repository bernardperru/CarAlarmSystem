public class CAS {

    private boolean armed = false;
    private boolean flash = false;

    private boolean closed = false;

    private boolean locked = false;

    private boolean sound = false;

    private enum Loc { L0, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15 };
    private Loc location;
    public CAS() {
        location = Loc.L0;
    }

    private void lock() {
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
    private void unlock() {
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

    private void close() {
        switch (this.location) {
            case L2:
                closed = true;
                this.location = Loc.L3;
                break;
            case L0:
                closed = true;
                this.location = Loc.L1;
                break;
            default:
                break;
        }
    }

    private void open() {
        switch (this.location) {
            case L1:
                closed = false;
                this.location = Loc.L0;
                break;
            case L3:
                closed = false;
                this.location = Loc.L2;
                break;
            default:
                break;
        }
    }

    private void armedOn() {
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

    private void armedOff() {
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

    private void soundOn() {
        switch (this.location) {
            case L15:
                sound = true;
                this.location = Loc.L10;
                break;
            default:
                break;
        }
    }

    private void soundOff() {
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

    private void flashOn() {
        switch (this.location) {
            case L9:
                flash = true;
                this.location = Loc.L15;
                break;
            default:
                break;
        }
    }

    private void flashOff() {
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
