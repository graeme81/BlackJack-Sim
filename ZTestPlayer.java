import static org.junit.Assert.*;

import org.junit.Test;

public class ZTestPlayer {

	@Test
	public void testCurrentCount20() {
		Player player = new Player();
		Card one = new Card(10);
		Card two = new Card(10);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 20);
	}
	@Test
	public void testCurrentCount21() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(10);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 21);
	}
	@Test
	public void testCurrentCount12() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(1);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 12);
	}
	@Test
	public void testCurrentCount14() {
		Player player = new Player();
		Card one = new Card(10);
		Card two = new Card(4);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 14);
	}
	@Test
	public void testCurrentCountSoft18() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(17);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 18);
	}
	@Test
	public void testCurrentCountSoft20() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(9);
		player.addCard(one);
		player.addCard(two);
		
		assertEquals(player.currentCount(), 20);
	}
	
	@Test
	public void testCurrentCount3Cards16() {
		Player player = new Player();
		Card one = new Card(10);
		Card two = new Card(2);
		Card three = new Card(4);
		player.addCard(one);
		player.addCard(two);
		player.addCard(three);
		
		assertEquals(player.currentCount(), 16);
	}
	
	@Test
	public void testCurrentCount3Cards20with2Aces() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(1);
		Card three = new Card(8);
		player.addCard(one);
		player.addCard(two);
		player.addCard(three);
		
		assertEquals(player.currentCount(), 20);
	}
	
	@Test
	public void testCurrentCount3Cards13() {
		Player player = new Player();
		Card one = new Card(1);
		Card two = new Card(1);
		Card three = new Card(1);
		player.addCard(one);
		player.addCard(two);
		player.addCard(three);
		
		assertEquals(13, player.currentCount());
	}
	
	

}
