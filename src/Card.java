public class Card {
	
	private String suit;
	private String rank;
	private int point_value;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}

	public String get_rank()
	{
		return rank;
	}
	
	public String get_suit()
	{
		return suit;
	}
	
	public int point_value()
	{
		return point_value;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		if(otherCard.rank().equals(this.rank) && otherCard.equals.suit().(this.suit) && otherCard.point_value()  == (point_value))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		//String all = rank + suit + point_value;
		 return rank +"of" + suit + "(" + point_value  + ")";
	}
}
