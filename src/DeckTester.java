/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                String[] suits = {"clubs", "hearts", "diamonds", "spades"};
                String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
                int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
                String[] suitsButBad = {"waga", "baba", "bobo", "uuuu"};
                String[] ranksButBad = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "0"};
                int[] valuesButBad = {2763, 5526, 8289, 11052, 13815, 16578, 19341, 22104, 24867, 27630, 27630, 27630, 27630};
                /**** EXAMPLE DECK 1****/
                System.out.println("this one is the first one");
                Deck deckThisIsADeck = new Deck(ranks, suits, values);
                System.out.println(deckThisIsADeck.size());
                Card x = deckThisIsADeck.deal();
                System.out.println("card " + x);
                System.out.println("deck is size " + deckThisIsADeck.size());
                System.out.println(deckThisIsADeck);
                /**** EXAMPLE DECK 2****/
                System.out.println("i think its the second one");
                Deck deckButBad = new Deck(ranksButBad, suitsButBad, valuesButBad);
                System.out.println(deckButBad.size());
                Card y = deckButBad.deal();
                System.out.println("card " + y);
                System.out.println("deck is size " + deckButBad.size());
                System.out.println(deckButBad);
                /**** EXAMPLE DECK 3****/
                System.out.println("uhhhhhhhhhhh 3");
                
                while(!deckButBad.isEmpty()){
                    
                }
	}
}

