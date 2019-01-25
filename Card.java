


public class Card{
	
	public String rank;
	public String suit;
	public int cardVal;
	
	
	public Card(String rankIn, String suitIn, int valIn ){
		
		this.suit=suitIn;
		this.cardVal=valIn;
		this.rank=rankIn;
	}
	
	public String getRank() {
		return rank;
	}
	public String getSuit() {
		return suit;
	}
	public int getVal() {
		return cardVal;
	}
	@Override
	public String toString() {
		return ("\n\t\t"+this.suit+this.rank+this.suit);
	}
}