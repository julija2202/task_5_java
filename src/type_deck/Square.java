package type_deck;

public class Square implements Deck {
    private int r_2_3;
    private double v;
    public Square() {
        r_2_3 = (int) (Math.random() * (10 + 1) + 10);
        v = (Math.pow((r_2_3 / (Math.sqrt(2))), 3));
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public int getR_2_2() {
        return r_2_3;
    }

    public void setR_2_2(int r_2_2) {
        this.r_2_3 = r_2_3;
    }
    public double volume() {

        return v;
    }
}

