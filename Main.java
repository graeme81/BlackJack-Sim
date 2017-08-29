
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		Player dealer = new Player();
		int rotations = 1000000;
		int stop = 0;
		int win = 0, total = 0;
		int atOne = 0, atTwo = 0, atThree = 0, atFour = 0, beat = 0;
		
		
		for (int i = 0; i < rotations; i++){
			Deck deck = new Deck(4);
			
			Game game = new Game(player, dealer, deck);
			stop = game.GetCount();
			
			System.out.println("count is: " + stop);
			
			switch(stop){
				case 1:
					win = 5;
					atOne++;
					break;
				case 2:
					win = 10;
					atTwo++;
					break;
				case 3:
					win = 15;
					atThree++;
					break;
				case 4:	case 5:	case 6:	case 7:	case 8:
					win = 20;
					atFour++;
					break;
				case 9:
					win = -2380;
					beat++;
					break;
				
			}
			System.out.println("win is: £"+win);
			total = total+win;
		}
		System.out.println("Total win after "+rotations+" rotations is: £"+total);
		System.out.println("One: " + atOne + ", Two: " + atTwo + ", Three: "+ atThree + ", Four: "+ atFour + ", BEAT: " + beat);
	}

}
