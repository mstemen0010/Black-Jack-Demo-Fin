package com.wintermute.cardgames.type52.resource;

import java.util.Stack;

import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;
import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCardDeck;

public abstract class FiftyTwoCardShoe {
	
	Stack<FiftyTwoCardDeck> decksInShoe;
	int shoeLimit = -1;
	int cardDeckCount = 0;
	FiftyTwoCardDeck currentDeck = null;

	public FiftyTwoCardShoe( int shoeLimit ) {
		decksInShoe = new Stack<FiftyTwoCardDeck>();
		this.shoeLimit = shoeLimit;
	}
	
	abstract public FiftyTwoCard dealCard();

	public void addDeck( FiftyTwoCardDeck deck ) {
		decksInShoe.push( deck );
	}
	
	public FiftyTwoCardDeck getDeck() {
		return decksInShoe.pop();
	}
	
}
