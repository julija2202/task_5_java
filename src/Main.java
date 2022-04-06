import type_deck.Cone;
import type_deck.Cylinder;
import type_deck.Deck;

public class Main {
    public static void main(String[] args){
        Port port = new Port();
       // System.out.println(port.ships);
        Deck deck = new Cylinder();
        Deck deck_1 = new Cone();
        System.out.println(deck.volume());
        System.out.println(deck_1.volume());
    }
}
