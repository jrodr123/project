
public class Card {

	private Suit mySuit;
	private int rank;
	private int value;  //Value to add to player hand value
	
	public Card(){
		
	}
	
	public Card(int r, Suit s){
		
		rank = r;
		mySuit = s;
		if (r > 10)
			value = 10;
		else if (r == 1)
			value = 11;
		else
			value = r;
	}
	public boolean isAce(){//Ace checker to properly evaluate value later.
		if (rank == 1)
			return true;
		else
			return false;
	}
	public int getRank(){
		
		return rank;
	}
	
	public Suit getSuit(){
		
		return mySuit;
	}
	public int getValue(){
		
		return value;
	}
	
	public String toString(){
		
		String numStr = "none";
		
		switch(this.rank){
		
		case 1:
			numStr = "Ace";
			break;
		case 2:
			numStr = "Two";
			break;
		case 3:
			numStr = "Three";
			break;
		case 4:
			numStr = "Four";
			break;
		case 5:
			numStr = "Five";
			break;
		case 6:
			numStr = "Six";
			break;
		case 7:
			numStr = "Seven";
			break;
		case 8:
			numStr = "Eight";
			break;
		case 9:
			numStr = "Nine";
			break;
		case 10:
			numStr = "Ten";
			break;
		case 11:
			numStr = "Jack";
			break;
		case 12:
			numStr = "Queen";
			break;
		case 13:
			numStr = "King";
			break;
		}
		
		return numStr + " of " + mySuit.toString();
	}
	
	public int compareTo(Card a){
		
		if(this.getRank() < a.getRank()){
			return -1;
		}
		else if(this.getRank() == a.getRank()){
			return 0;
		}
		else
			return 1;
	}
}
