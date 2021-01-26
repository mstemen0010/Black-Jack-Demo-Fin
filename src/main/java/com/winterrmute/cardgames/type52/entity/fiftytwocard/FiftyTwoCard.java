package com.winterrmute.cardgames.type52.entity.fiftytwocard;


	/**
	 *
	 * @author Mathias
	 */
	public interface FiftyTwoCard {
	    public enum PlayCardSuite {
	    	Undefined(""),
	        Aces("Ace"),
	        Hearts("Heart"),
	        Diamonds("Diamond"),
	        Clubs("Club"),
	        OutOfRange("oar")
	        ;
	    	String name = "";
	    	PlayCardSuite( String name) {
	    		this.name = name;
	    	}
	    	
	    }
	    public enum PlayCardRank {
	        Undefined(-1),
	        King(10),
	        Queen(10),
	        Jack(10),
	        Ace(111),
	        Two(2),
	        Three(3),
	        Four(4),
	        Five(5),
	        Six(6),
	        Seven(7),
	        Eight(8),
	        Nine(9),
	        Ten(10),
	        OutOfRange(1000)
	        ;
	        int value;
	        PlayCardRank(int value) {
	            this.value = value;
	        }
	        
	        public int getValue() {
	            return this.value;
	        } 
	    }
	    public PlayCardSuite getSuite();
	    
	    public PlayCardRank getRank();
	    
	 
	    
	    // EnumSet CardDeck<52PlayingCard>;
	}

