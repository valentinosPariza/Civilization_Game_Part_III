package model;



/**
 * 
 * This class represents similar with the {@linkplain model.Fish} class the food but in this time,the food which 
 * is gained from hunting.This class contains 
 * Instance variables:
 *  {@linkplain model.Game#healthIncrease}
 * Two Constructors:
 * {@linkplain model.Game#Game()}
 * {@linkplain model.Game#Game(int)}
 * One instance method:
 * {@linkplain model.Game#getHealth()}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Game {
	
	
    private int healthIncrease;		// instance attribute representing the food which is available in a Game object

    
    
    
    /**
	 * This constructor creates an object type of Game with a given quantity of food(health points).
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @param healthIncrease health represents the health points which the object will have in its existence
	 * @return 
	 */
    public Game(int healthIncrease) {
        this.healthIncrease = healthIncrease;
    }

    
    
    /**
	 * This constructor creates an object type of Game by using the previous Constructor 
	 * {@linkplain model.Game#Game(int)} for creating a standard object containing of 20 health points of food.
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return 
	 */
    public Game() {
        this(20);
    }

    
    
    /**
	 * This  method returns the amount of food-health points which a Game object has.
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the value of the food which the object Game has(the points of health that can give to a Civilization)
	 */
    public int getHealth() {
        return healthIncrease;
    }

}
