import java.util.Random;

public class Deck {

	private Card[] myCards;
	private int numCards;
	
	public Deck(){
		
		this(1);
	}
	
	public Deck(int decks){
		
		numCards = decks * 52;
		myCards = new Card[numCards];
		int index = 0;
		for(int d = 0; d < decks; d++){
			for(int s = 0; s < 4; s++){
				for(int n = 1; n <= 13; n++){
					myCards[index]= new Card(n,Suit.values()[s]);
					index++;
				}
			}
		}
		this.shuffle();
	}
	
	public void shuffle(){
		
		Random rng = new Random();
		
		Card temp;
		int random;
		
		for (int i = 0; i < this.numCards; i++){
			
			random = rng.nextInt(this.numCards);
			
			temp = this.myCards[i];
			this.myCards[i] = this.myCards[random];
			this.myCards[random] = temp;
			
		}
	}
	
	public Card[] getDeck(){
		
		return this.myCards;
	}
	
	public Card getNextCard(){
		
		Card top = myCards[0];
		
		for(int i = 1; i < numCards; i++){
			
			myCards[i-1] = myCards[i];
		}
		this.myCards[numCards-1] = null;
		numCards--;
		
		return top;
	}
	
	public void printDeck(int numToPrint){
		
		for(int i =0; i < numToPrint; i++){
			
			System.out.println(i+1 + " "+ this.myCards[i].toString());
		}
	}
}
