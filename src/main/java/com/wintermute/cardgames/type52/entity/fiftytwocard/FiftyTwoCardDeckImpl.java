package com.wintermute.cardgames.type52.entity.fiftytwocard;

import java.util.Stack;

public abstract class FiftyTwoCardDeckImpl extends Stack<FiftyTwoCard> implements FiftyTwoCardDeck
{

	private boolean deckPrinted = false;
	
	public FiftyTwoCardDeckImpl() {
		deckPrinted = printDeck();
	}
	
	public boolean  wasPrinted() {
		return deckPrinted;
	}
	

}
