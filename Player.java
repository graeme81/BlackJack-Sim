import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand;
	
	public Player(){
		this.hand = new ArrayList<Card>();	 
	}
	
	public ArrayList<Card> holding(){
		return hand;
	}
	
	public int currentCount(){
		int count = 0, aces = 0;
		
		for(Card card: holding()){
			int cardIs = card.getValue();
			if (cardIs == 1){
				cardIs = 11;
				aces++;
			}
			count = count + cardIs;
			if(count > 21 && aces != 0){
				aces--;
				count = count - 10;
			}
		}
		
		return count;
	}
	
	public void addCard(Card card){
		hand.add(card);
	}
	
	public void fold(){
		hand.clear();
	}
	
	public ArrayList<Integer> deltHand(){
		int count = 0,card1 = 0,card2 = 0, aces = 0, pair = 0;
		ArrayList<Integer> info = new ArrayList<Integer>();
		
		card1 = hand.get(0).getValue();
		card2 = hand.get(1).getValue();
		
		if(card1 == 1){
			aces ++;
			card1 = 11;
		}
		if(card2 == 1){
			aces ++;
			card2 = 11;
		}
		count = card1 + card2;
		if(count > 21){
			count = count - 10;
		}
		
		if (card1 == card2){
			pair = 1;
		}
		
		info.add(count);
		info.add(aces);
		info.add(pair);
		return info;
	}
}
