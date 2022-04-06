package type_deck;

public class Cone implements Deck {
    private int r_2_2;
    private int h_2;
    public double pi = 3.14;
    public double v;
    public double l = 3;

    public Cone() {
        r_2_2 = (int) (Math.random() * (10 + 1) + 10);
        h_2 = (int) (Math.random() * (90 + 1) + 10);
        v =  (pi * h_2 * r_2_2)/l ;
    }
    public double getV() {
        return v;
    }
    public void setV(double v) {
        this.v = v;
    }

    public int getR_2_2() {
        return r_2_2;
    }

    public void setR_2_2(int r_2_2) {
        this.r_2_2 = r_2_2;
    }

    public int getH_2() {
        return h_2;
    }

    public void setH_2(int h_2) {
        this.h_2 = h_2;
    }

    @Override
    public double volume() {
        return v;
    }
}
