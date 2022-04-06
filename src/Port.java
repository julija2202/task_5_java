import type_deck.Cone;
import type_deck.Cylinder;
import type_deck.Deck;

public class Port {
    public Port() {
        //Deck deck = new Cylinder();
        //Deck deck_1 = new Cone();
        int[] ships = new int[10];
        int elements = (int) (Math.random() * (1 + 1) + 1);
        for (int i = 0; i < 10; i++) {
            ships[i] = elements;
            /*if (elements == 1) {
                return deck.volume();
            }  else{
                return deck_1.volume();
            }*/
            System.out.println(ships[i]);
        }
    }
}


