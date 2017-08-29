import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	
	private ArrayList<Card> deck;
	
	public Deck(int num){
		this.deck = new ArrayList<Card>();
		
		for(int i = 0; i < num; i++){
			populateDeck();
		}
		shuffle();
	}
	
	public void populateDeck(){
		for(int suit = 0; suit < 4; suit++){
			for(int value = 0; value < 13; value++){
				int points;
				if(value < 10){
					points = value + 1;
				}else{
					points = 10;
				}
				deck.add(new Card(points));
			}
		}
	}
	
	public int deckSize(){
		return deck.size();
	}

	public Card getCards(){
		Card card = deck.remove(0);
		return card;
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public void Deal(Deck deck, Player player, Player dealer){
		player.addCard(deck.getCards());
		dealer.addCard(deck.getCards());
		player.addCard(deck.getCards());
		dealer.addCard(deck.getCards());		
	}
}
