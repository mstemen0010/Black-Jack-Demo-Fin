package com.wintermute.cardgames.type52.entity.fiftytwocard;


	/**
	 *
	 * @author Mathias
	 */
	public interface FiftyTwoCard {
	    public enum PlayCardSuite {
	        Spades("Spades"),
	        Clubs("Clubs"),
	        Diamonds("Diamonds"),
	        Hearts("Hearts")
	        ;
	    	String name = "";
	    	PlayCardSuite( String name) {
	    		this.name = name;
	    	}
	    	
	    }
	    public enum PlayCardRank {
	    	A(111),
	    	K(10),
	    	Q(10),
	    	J(10),
	        Ten(10),
	        Nine(9),
	        Eight(8),
	        Seven(7),
	        Six(6),
	        Five(5),
	        Four(4),
	        Three(3),
	        Two(2)
	        ;
	        int value;
	        PlayCardRank(int value) {
	            this.value = value;
	        }
	        
	        public String getRankName() {
	        	String retName = this.name();
	        	
	        	switch (this.name() ) {
	        	case "A":
	        	case "K":
	        	case "Q":
	        	case "J":
	        		break;
	        	default: 
	        		retName = String.valueOf(this.value );
	        	
	        	}
	        	
	        	return retName;
	        }
	        
	        public int getValue() {
	            return this.value;
	        } 
	        
	        public int aceHigh() {
	        	return PlayCardRank.A.getValue() % 100;
	        }
	        
	        public int aceLow() {
	        	return PlayCardRank.A.getValue() / 100;
	        }
	    }
	    public PlayCardSuite getSuite();
	    
	    public PlayCardRank getRank();
	    
	 
	    
	    // EnumSet CardDeck<52PlayingCard>;
	}

