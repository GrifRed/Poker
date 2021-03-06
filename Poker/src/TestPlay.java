import java.util.ArrayList;

public class TestPlay
	{

		
		public static void main(String[] args)
			{
				
				Deck.fillDeck();
				ArrayList<Card> deck = Deck.deck;
				ArrayList<Card> hand = new ArrayList<Card>();

				//straight flush test set
//				String[] getHand = {"Three of Clubs", "Six of Hearts" ,"Five of Clubs","Four of Spades","Seven of Spades","Two of Spades","Eight of Spades"};
//				String[] getHand = {"Ten of Spades", "Jack of Spades" ,"King of Spades","Two of Clubs","Queen of Spades","Four of Hearts","Ace of Spades"};
				
				//four of a kind and full house test set
//				String[] getHand = {"Ace of Spades", "Five of Clubs" ,"Four of Spades","Five of Spades","Five of Diamonds","Four of Clubs","Five of Hearts"};
//				String[] getHand = {"Ace of Spades", "Two of Clubs" ,"Four of Spades","Five of Clubs","Four of Diamonds","Four of Clubs","Five of Hearts"};
//				String[] getHand = {"Ace of Spades", "Two of Clubs" ,"Seven of Spades","Jack of Clubs","Three of Diamonds","Four of Clubs","Six of Hearts"};


				//RANDOM HAND
				for (int i = 0; i < 7; i++) {
					hand.add(deck.get(0));
					deck.remove(0);
				}
				
				//CUSTOM HAND
//				for(int i = 0; i < getHand.length; i++){
//					for(int j = 0; j < deck.size(); j++){
//						Card c = deck.get(j);
//						if(c.getName().equals(getHand[i])){
//							hand.add(c);
//							deck.remove(c);
//						
//						}
//					}
//				}

				System.out.println("Cards received:");
				for (Card c : hand) {
					System.out.println(c.getName());
				}

				Hand rankedHand = HandEvaluation.evaluate(hand);
				
				System.out.println("\n\n");
				System.out.println("Found a " + rankedHand.getLabel());
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
				for (Card c : rankedHand.getCards()) {
					System.out.println(c.getName());
				}
			}
		
}
