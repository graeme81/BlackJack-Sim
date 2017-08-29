
public class Game {
	private int count = 0;

	public Game(Player player, Player dealer, Deck deck){
		
		int won = 0, lost = 0, push = 0;
		int result = 0;
		
		//for(int i = 0; i < 8; i++){
		while(won == 0 && lost != 8){
			count++;
			deck.Deal(deck, player, dealer);
			
//***********************BLACKJACKS****************************************************		
			//if dealer gets blackjack
			if(dealer.deltHand().get(0) == 21){
				//and player gets blackjack
				if (player.deltHand().get(0) == 21){
					result = 3;
					System.out.println("Double BlackJack");
				}else{ //only dealer blackjack
					result = 2;
					System.out.println("Dealer BlackJack");
				}	
			}else if(player.deltHand().get(0) == 21){ // only player blackjack
				result = 1;
				System.out.println("Player BlackJack");

				
//*************************PLAY*********************************************************				
				
			}else{
				int show = dealer.holding().get(0).getValue();
				//dealer is weak
				if (show < 7 && show !=1){
					while(player.currentCount() < 12){
						player.addCard(deck.getCards());
					}
					while(dealer.currentCount() < 17){
						dealer.addCard(deck.getCards());
					}
					result = Result(player, dealer);
					
				//dealer is strong	
				}else{
					while(player.currentCount() < 17){
						player.addCard(deck.getCards());
					}
					if(player.currentCount()>21){
						result = 2;
					}else{
						while(dealer.currentCount() < 17){
							dealer.addCard(deck.getCards());
						}
						result = Result(player, dealer);		
					}	
				}
			}
			
//*******************************************RESULTS*******************************************		
			
			switch(result){
			case 1:
				won++;
				System.out.println("================================================Player wins!");
				break;
			case 2:
				lost++;
				System.out.println("================================================Dealer wins!");
				break;
			case 3:
				push++;
				count--;
				System.out.println("================================================Push!");
				break;	
			}
			
			System.out.println("Player has "+ player.currentCount() + " _-_ Dealer has: " + dealer.currentCount());
			
			player.fold();
			dealer.fold();
		}
		int games = won+lost+push;
		System.out.println("won: " + won + ",push: "+ push + ",lost: " + lost +",games = "+ games );

			
	}
	
	
	public int Result(Player player, Player dealer){
	
		if(dealer.currentCount()>21){
			return 1;

		}else if (dealer.currentCount() > player.currentCount()){
			return 2;

		}else if (dealer.currentCount() < player.currentCount()){
			return 1;

		}else{
			return 3;
		}	
	}
	
	 public int GetCount(){
		 return count;
	 }
		 
}
