package com.wintermute.cardgames.type52.games.BlackJack;

import java.util.Stack;

import com.wintermute.cardgames.type52.entity.cardplayer.CardPlayer;
import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardRank;

public class BlackJackPlayer extends CardPlayer  {
	
	
	BlackJackGame currGame = null; 
	Stack<BlackJackCard> hand = new Stack<>();
	int handTotal = 0;
	boolean hasAce = false;
	String name = null;
	StringBuilder logMsg = null; 
	
	public BlackJackPlayer(boolean isDealer, BlackJackGame currGame) {
		super(isDealer);
		if( isDealer ) 
			name = "Dealer";
		else 
			name = "Player";
		this.currGame = currGame;
		// TODO Auto-generated constructor stub
	}
	
	public int newHand() {
		logMsg = new StringBuilder();
		BlackJackCard card1 = currGame.getCard();
		BlackJackCard card2 = currGame.getCard();
		int card1Val = card1.getRank().getValue();
		int card2Val = card2.getRank().getValue();
		addToLogMsg( showHand(card1, card2) );
		if( card1Val == 10 &&  card2.getRank()== PlayCardRank.A) {
			handTotal= 21;
			hasAce = true; /// for completeness 
		}
		else if ( card2Val == 10 &&  card1.getRank()== PlayCardRank.A) {
			handTotal = 21;
			hasAce = true;
		}
		else {
			if( card1.getRank() == PlayCardRank.A )
			{
				int tempHandTotal = handTotal;
				hasAce = true;
				handTotal = card2Val + card1.getRank().aceHigh();
				if( handTotal > 21 ) {
					handTotal = tempHandTotal + card2Val + card1.getRank().aceLow();				
				}
			}
			else if( card2.getRank() == PlayCardRank.A) {
				int tempHandTotal = handTotal;
				hasAce = true;
				handTotal = card1Val + card2.getRank().aceHigh();
				if( handTotal > 21 ) {
					handTotal = tempHandTotal + card1Val + card2.getRank().aceLow();
				}		
			}
			else {
				handTotal = card1Val + card2Val;
			}
		}
		
		return handTotal;
	}
	public int playHand()  {
		BlackJackCard cardN = currGame.getCard();
		
		if( cardN.getRank()== PlayCardRank.A ) {
			int tempHandTotal = handTotal;
			hasAce = true;
			handTotal += cardN.getRank().aceHigh();
			if( handTotal > 21 ) {
				handTotal = tempHandTotal + cardN.getRank().aceLow();
			}	
		}
		else {
			handTotal += cardN.getRank().getValue();
		}
		addToLogMsg( addHand( cardN ));
		return handTotal;
	}
	
	public String getName() {
		return name;
	}
	
	private void addToLogMsg( String msg ) {
		logMsg.append(msg);
	}
	
	public String getLogMsg() {
		return logMsg.toString();
	} 
	
	public void clearLogMsg() {
		logMsg = new StringBuilder();
	}
	
	private String showHand( BlackJackCard c1, BlackJackCard c2) {
		return new String ( getName() + " hand : " + c1.s + " " + c1.r.getRankName() + ", " + c2.s + " " + c2.r.getRankName() );
	}
	
	private String addHand( BlackJackCard c1 ) {
		return new String( ", " + c1.s + " " + c1.r.getRankName());
	}

}
