package type_deck;

public class Cylinder implements Deck {
    private int r_2;
    private int h;
    public double pi = 3.14;
    public double v;

    public Cylinder() {
        r_2 = (int) (Math.random() * (10 + 1) + 10);
        h = (int) (Math.random() * (90 + 1) + 10);
        v = (pi * h * r_2);
    }
    public double getV() {
        return v;
    }
    public void setV(double v) {
        this.v = v;
    }

    public int getR_2() {
        return r_2;
    }

    public void setR_2(int r_2) {
        this.r_2 = r_2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double volume() {
        return v;
    }
}

