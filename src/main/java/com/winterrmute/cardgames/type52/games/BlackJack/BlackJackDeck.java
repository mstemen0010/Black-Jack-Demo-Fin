package com.winterrmute.cardgames.type52.games.BlackJack;

import com.winterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;
import com.winterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCardDeckImpl;
import com.winterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardRank;
import com.winterrmute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard.PlayCardSuite;

public class BlackJackDeck extends FiftyTwoCardDeckImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean printDeck() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for ( PlayCardSuite s: PlayCardSuite.values() )
		{
			for ( PlayCardRank r: PlayCardRank.values())
			{
				if( s != PlayCardSuite.Undefined && r != PlayCardRank.Undefined )
					if( s != PlayCardSuite.OutOfRange && r != PlayCardRank.OutOfRange )
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
		// TODO Auto-generated method stub
		return null;
	}

	
}
