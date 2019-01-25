import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;



public class HigherOrLower {

	public static void main (String [] args)
	{
		String[] ranks= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suits= {"\u2665","\u2660","\u2663","\u2666"};
		int[] value= {2,3,4,5,6,7,8,9,10,10,10,10,11};
		Scanner sc= new Scanner(System.in);
		
		Deck deck1= new Deck(ranks,suits,value);
		
		//deck1.printAllCards(); //if activated will print the entire deck in order
		
		deck1.shuffleDeck();
		deck1.shuffleDeck();
		deck1.shuffleDeck(); //shuffled the deck 3 times
		
		//deck1.printAllCards(); //if activated will print entire deck after shuffle
			
		
		//System.out.println(deck1.getValue(4)); //prints pointvalue of object in index 4
		
		
		/*Here I will add the option to add multiple decks for a longer game
		 * int numberOfDecks;
		 
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("How many decks?");
		
		numberOfDecks = scan.nextInt();
		*/
		int scoreCount=0; //initiates score as zero
		
		int indexInc=0;
		System.out.println("!!!New game of Higher or Lower!!!\n"
							+ "Here are the rules:\n"
							+ "There is one deck with 52 cards\n"
							+ "A card gets drawn and shown\n"
							+ "Guess if the next card is higher or lower\n"
							+ "A correct guess earns you 1 point, an incorrect guess loses you 1 point\n"
							+ "If the two cards are equal in value, they get thrown out without a penalty");
			
		do
		{
			System.out.println("\nYour card: ");
			deck1.printCard(indexInc);
			
			System.out.println("Is the next card higher....or lower? \n "
					+ "(Type 0 for higher or 1 for lower)");
			
			
			
			
			int input= sc.nextInt();
			
		
			
			
			if(input == 0)
			{
				if (deck1.getValue(indexInc+1) < deck1.getValue(indexInc))
				{
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("WRONG!! -1 point! Better luck next time.\n");
					scoreCount--;
					indexInc+=2;
				}
				else if (deck1.getValue(indexInc+1) > deck1.getValue(indexInc ))
				{
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("Good job! +1 point! Here comes the next one.\n");
					scoreCount++;
					indexInc+=2;
				}
				else {
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("They're equal, this one doesn't count.\n");
					indexInc+=2;
				}
			}
			else if (input == 1)
			{
				if (deck1.getValue(indexInc+1) < deck1.getValue(indexInc))
				{
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("Good job! +1 point! Here comes the next one.\n");
					scoreCount++;
					indexInc+=2;
				}
				else if (deck1.getValue(indexInc+1) > deck1.getValue(indexInc))
				{
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("WRONG!! -1 point! Better luck next time.\n");
					indexInc+=2;
					scoreCount--;
				}
				else {
					System.out.println("The card is: ");
					deck1.printCard(indexInc + 1);
					
					System.out.println("They're equal, this one doesn't count.\n");
					indexInc+=2;
				}
			}
			else {
				System.out.println("Your score is: "+ scoreCount);
			}
			
				
			
			
			
			
			
		} while(indexInc < deck1.getDeckSize());
		
		
		System.out.println("\n\n\nYour final score is: "+scoreCount);
		
		sc.close();
	}//end of main
	
	
	
}//end of class