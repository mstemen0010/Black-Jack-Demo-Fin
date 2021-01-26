package com.wintermute.cardgames.type52.games.BlackJack;

import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;
import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCardDeckImpl;
import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardRank;
import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardSuite;

public class BlackJackDeck extends FiftyTwoCardDeckImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean printDeck() {
		
		for ( PlayCardSuite s: PlayCardSuite.values() )
		{
			
			for ( PlayCardRank r: PlayCardRank.values())
			{
					this.add( new BlackJackCard( s, r ));
			}
		}		
		return true;
}

	public boolean shuffleDeck() {
		// TODO Auto-generated method stub
		return false;
	}

	public FiftyTwoCard drawCard() {
		return this.pop();
	}

	
}
