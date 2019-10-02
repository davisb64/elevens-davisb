/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
            /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            /**** CARD 1 ****/
            Card x = new Card("king", "spades", 13);
            System.out.println("My card is ranked: " + x.rank());
            System.out.println("My card is suited: " + x.suit());
            System.out.println("My card is pointed: " + x.pointValue());
            System.out.println(x);
            /**** CARD 2 ****/
            Card y = new Card("king", "spades", 13);
            System.out.println("My card is ranked: " + y.rank());
            System.out.println("My card is suited: " + y.suit());
            System.out.println("My card is pointed: " + y.pointValue());
            System.out.println(y);
            System.out.println(x.matches(y));
            /**** CARD 3 ****/
            Card z = new Card("Mr. A", "Liam", 1);
            System.out.println("My card is ranked: " + z.rank());
            System.out.println("My card is suited: " + z.suit());
            System.out.println("My card is pointed: " + z.pointValue());
            System.out.println(z);
            System.out.println(x.matches(z));
            System.out.println(y.matches(z));
	}
}
