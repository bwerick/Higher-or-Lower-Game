import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



class Deck{
	//need to make 52 card objects
	int xSize;
	//Card currCard; havent used
	List<Card> allCards;
	
	public Deck(String[] rank, String[] suit, int[] value)
	{
		List<Card> deckCards = new ArrayList<Card>();
		
		for(String suitString : suit)
		{
			for(int i=0; i < rank.length;i++)
			{
				deckCards.add(new Card(rank[i],suitString,value[i]));
			}
		}
		this.xSize= deckCards.size();
		
		this.allCards= deckCards;
	}
	public int getDeckSize() {
		
		return xSize;
	}
	public void printAllCards() {
		System.out.println(allCards);
	}
	public void shuffleDeck() {
		Collections.shuffle(this.allCards);
	}
	public int getValue(int index) {
		int cardVal;
		Card theCard= allCards.get(index);
		cardVal= theCard.getVal();
		
		return cardVal;
		
	}
	public void printCard(int index) {
		
		System.out.println(allCards.get(index));
	}
	
	
}
