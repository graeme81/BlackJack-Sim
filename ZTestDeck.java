import static org.junit.Assert.*;

import org.junit.Test;

public class ZTestDeck {

	@Test
	public void testSet1Deck() {
		Deck deck = new Deck(1);
		int length = deck.deckSize();
		assertEquals(52, length);	
	}
	
	@Test
	public void testSet4Deck() {
		Deck deck = new Deck(4);
		int length = deck.deckSize();
		assertEquals(208, length);	
	}

}
