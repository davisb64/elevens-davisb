/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 30;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
                int[] temporaryPermit=new int[values.length];
                int mid=temporaryPermit.length/2;
                int tempPos=0;
                int k=0;
                for(;k<mid;k++){
                    temporaryPermit[tempPos]=values[k];
                    tempPos+=2;
                }
                tempPos=1;
                for(;k<temporaryPermit.length;k++){
                    temporaryPermit[tempPos]=values[k];
                    tempPos+=2;
                }
                for(int die = 0;die<temporaryPermit.length;die++){
                    values[die] = temporaryPermit[die];
                }
	}
        
        public static void perfectInShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
                int[] temporaryPermit=new int[values.length];
                int mid=temporaryPermit.length/2;
                int tempPos=1;
                int k=0;
                for(;k<mid;k++){
                    temporaryPermit[tempPos]=values[k];
                    tempPos+=2;
                }
                tempPos=0;
                for(;k<temporaryPermit.length;k++){
                    temporaryPermit[tempPos]=values[k];
                    tempPos+=2;
                }
                for(int die = 0;die<temporaryPermit.length;die++){
                    values[die] = temporaryPermit[die];
                }
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
                int temp;
                for(int k=values.length-1;k>=0;k--){
                    int pos = (int)(Math.random()*(k+1));
                    temp = values[pos];
                    values[pos] = values[k];
                    values[k] = temp;
                }
	}
}