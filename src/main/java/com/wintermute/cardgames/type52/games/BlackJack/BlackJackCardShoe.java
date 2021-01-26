package com.wintermute.cardgames.type52.games.BlackJack;

import com.wintermute.cardgames.type52.resource.FiftyTwoCardShoe;

public class BlackJackCardShoe extends FiftyTwoCardShoe {

	BlackJackDeck currentDeck = null;
	int cardsInShoe = 52;
	public BlackJackCardShoe(int shoeLimit) {
		super(shoeLimit);
		// TODO Auto-generated constructor stub
	}

	public void addDeck( BlackJackDeck deckToAdd ) {
		super.addDeck(deckToAdd);
	}
	@Override
	public BlackJackCard dealCard() {
		BlackJackCard card = null;
		if( currentDeck == null  || cardsInShoe == 0) {
			currentDeck =(BlackJackDeck) super.getDeck();
		}
		else {
			cardsInShoe = 52;
		}
		if( currentDeck != null ) {
			card = (BlackJackCard) currentDeck.drawCard();
			cardsInShoe--;
		}
		// TODO Auto-generated method stub
		return card;
	}

}
