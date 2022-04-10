import type_deck.Cone;
import type_deck.Cylinder;
import type_deck.Deck;
import type_deck.Square;

public class Main {
    public static void main(String[] args){
        Ship ships = new Ship();
        Deck deck = new Cylinder();
        Deck deck_1 = new Cone();
        Deck deck_2 = new Square();
        System.out.println();
        //System.out.println(deck_1.volume());
        //System.out.println(deck_2.volume());
    }
}
