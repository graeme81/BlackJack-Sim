
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		Player dealer = new Player();
		int rotations = 1000;
		int stop = 0;
		int win = 0, total = 0;
		
		
		for (int i = 0; i < rotations; i++){
			Deck deck = new Deck(4);
			
			Game game = new Game(player, dealer, deck);
			stop = game.GetCount();
			
			System.out.println("count is: " + stop);
			
			switch(stop){
				case 1:
					win = 5;
					break;
				case 2:
					win = 10;
					break;
				case 3:
					win = 15;
					break;
				case 4:	case 5:	case 6:	case 7:	case 8:
					win = 20;
					break;
				case 9:
					win = -2380;
					break;
				
			}
			System.out.println("win is: £"+win);
			total = total+win;
		}
		System.out.println("Total win after "+rotations+" rotations is: £"+total);
	}

}
