import type_deck.Cone;
import type_deck.Cylinder;
import type_deck.Deck;
import type_deck.Square;
import java.util.Arrays;
import static java.lang.Double.sum;

public class Ship {

    public Ship() {
        int[] ships = new int[10];
        Deck deck = new Cylinder();
        Deck deck_1 = new Cone();
        Deck deck_2 = new Square();
        for (int i = 0; i < 10; i++) {
            int elements = (int) (Math.random() * (7 - 1) + 1);
            ships[i] = elements;
            System.out.println(ships[i]);
            Double[] allmassa = new Double[10];
            int elements_2 = (int) (Math.random() * (11 - 1) + 0);
            allmassa[i] = (double) elements_2;
            if (elements == 1) {
                allmassa[i] = (double) deck.volume();
            } else if (elements == 2) {
                allmassa[i] = ((double) deck.volume()) * 2;
            } else if (elements == 3) {
                allmassa[i] = (double) deck_1.volume();
            } else if (elements == 4) {
                allmassa[i] = ((double) deck_1.volume()) * 2;
            } else if (elements == 5) {
                allmassa[i] = (double) deck_2.volume();
            } else if (elements == 6) {
                allmassa[i] = ((double) deck_2.volume()) * 2;
            }
            System.out.println(allmassa[i]);
            //    double sum = 0;
           //     for (double num: allmassa) {
            //        sum = sum + num;
            //    }
                //System.out.println(sum);
            }
        }
}