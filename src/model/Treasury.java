package model;

/**
 * 
 * This class is the most important class in all the actions made by the player.It represents the treasures,coins and
 * generally the money which a player has and collects.This class is used for creating objects serving the purpose of
 * simulating a treasure-room.This class contains:
 * Instance variables: 
 * {@linkplain model.Treasury#coins} 
 * Two Constructors:
 * {@linkplain model.Treasury#Treasury()}
 * {@linkplain model.Treasury#Treasury(int)}
 * And Instance Methods:
 * {@linkplain model.Treasury#getCoins()}
 * {@linkplain model.Treasury#spend(int)}
 * {@linkplain model.Treasury#earn(int)}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Treasury {
	
    private int coins;			//  private instance attribute representing the coins and generally the wealth 
    
    
    /**
	 *A constructor for creating a new object of type Treasury which has initially a number of coins which is indicated 
	 *by parameter coins. 
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @param coins an integer number indicating the initial amount of coins of a Treasury 
	 * @return
	 */
    public Treasury(int coins) {
        this.coins = coins;
    }

    
    /**
	 *A constructor for creating a new object of type Treasury which has initially 500 coins by calling constructor
	 *{@linkplain model.Treasury#Treasury(int)} with parameter 500. 
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return
	 */
    public Treasury() {
        this(500);
    }

    
    /**
	 * A method which is used to return the number of coins being stored in the Treasury(Object).
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return coins which are stored int the Trasury
	 */
    public int getCoins() {
        return coins;
    }

    
    
    
    /**
	 * A method which is used to evaluate if there are enough coins to do an action.if there are enough,then the coins 
	 * which are used as a parameter are removed from the coins in the object Treasury and then the method returns true
	 * to indicate that the remove action was made succesful.
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return a boolean value indicating if the coins were spend
	 * @param cost the amount of coins which need to be spent
	 */
    public boolean spend(int cost) {
        this.coins -= cost;
        return true;
    }

    

	/**
	 * This method is used to increase the coins in the Object type of Treasury
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return
	 * @param pay the earnings of the player which has to be added ,in his/her treasury
	 */
    public void earn(int pay) {
        this.coins += pay;
    }
}
