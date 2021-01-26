package com.wintermute.cardgames.type52.games.BlackJack;

import com.wintermute.cardgames.type52.entity.fiftytwocard.FiftyTwoCard;

public class BlackJackCard implements FiftyTwoCard {

	PlayCardSuite s = null;
	PlayCardRank r = null;
	
	public BlackJackCard( PlayCardSuite s, PlayCardRank r) {
		this.s = s;
		this.r = r;
	}

	public PlayCardSuite getSuite() {
		// TODO Auto-generated method stub
		return s;
	}

	public PlayCardRank getRank() {
		// TODO Auto-generated method stub
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String showCard() {
		StringBuilder sb = new StringBuilder( s.toString() );
		sb.append(r.toString());
		sb.append(", ");
		return sb.toString();    	
	}

	public int getValue() {
		return r.getValue();
	}


}
