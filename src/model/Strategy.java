package model;



/**
 * 
 * This class is used to represent the Strategy of each civilization.This class is a type of objects which  
 *  objects contain an attribute for the overall Points in section of Strategy,which a civilization have.This class
 *  also includes:
 * Instance variables: 
 * {@linkplain model.Strategy#strategyLevel}
 * {@linkplain model.Strategy#conqueredTheWorld}
 * Two static constants:
 * {@linkplain model.Strategy#BATTLE_INCREASE} 
 * {@linkplain model.Strategy#SIEGE_INCREASE}
 * And instance methods:
 * {@linkplain model.Strategy#battle()}
 * {@linkplain model.Strategy#Siege()}
 * {@linkplain model.Strategy#conqueredTheWorld()}
 * {@linkplain model.Strategy#getStrategyLevel()}
 * {@linkplain model.Strategy#setConqueredTheWorld()}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Strategy {
	
    private int strategyLevel;					//  shows the points of \Strategy level which a civilization might have
    
    private boolean conqueredTheWorld;   		//  this variable defines if a civilization has conquered the world
												//  hypothetically
    
    
    private static final int BATTLE_INCREASE = 10;   	// when battling ,a civilization gains 10 points
    
    private static final int SIEGE_INCREASE = 40;		//  when sieging a civilization gains 40 strategy points

    
    
    
    /**
	 * A method for simulating a real battle and its consequences!Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain model.Strategy#BATTLE_INCREASE} .Also set 
	 * the boolean value for the attribute setConqueredTheWorld in case of completing the task of transcending 150
	 * strategy points {@linkplain model.Strategy#setConqueredTheWorld()}
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * 
	 */
    public void battle() {
        strategyLevel += BATTLE_INCREASE;
        setConqueredTheWorld();
    }

    
    
    /**
	 * A method for simulating a real(hypothetically) siege of a place giving the opportunity to the player to 
	 * gain experience in sieging!Also this method checks if the player has gained the appropriate amount of 
	 * Strategy points in order to be the winner of the game (calling the private method (helper method) 
	 * {@linkplain model.Strategy#setConqueredTheWorld()}). Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain model.Strategy#SIEGE_INCREASE} .
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 *
	 */
    public void siege() {
        strategyLevel += SIEGE_INCREASE;
        setConqueredTheWorld();
    }

    
    
    /**
	 * This method (getter) returns if the Strategy of a player has reached in that point which is assumed to be a 
	 * Conquer of the world!
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the  boolean value in the attribute {@linkplain model.Strategy#conqueredTheWorld} 
	 */
    public boolean conqueredTheWorld() {
        return conqueredTheWorld;
    }

    
    
    /**
	 * This method (getter) returns the Strategy level which is an attribute of the Strategy object.
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the amount of Strategy points which a player has earned so far
	 *  {@linkplain model.Strategy#strategyLevel} 
	 *  
	 */
    public int getStrategyLevel() {
        return strategyLevel;
    }

    
    
    /**
     *  
	 * Set the boolean value for the attribute setConqueredTheWorld, by examining if the StrategyLevel is greater or
	 * equal to 150 points
	 * 
     * 
     * @author valentinos Pariza 
	 * @since 1/4/2018
	 * 
     */
    private void setConqueredTheWorld() {
        conqueredTheWorld = (strategyLevel >= 150);
    }
}
