package model;



/**
 * 
 * This class is used for representing the fish in the game as objects.In this object some functions and attributes
 * of the fish as food for people ,is used for succeeding the purpose of the game!This class contains:
 * One Instance attribute:
 * {@linkplain model.Fish#healthIncrease} 
 * One Instance Methods:
 * {@linkplain model.Fish#getHealth()} 
 * Three Constructors
 * {@linkplain model.Fish#Fish()} 
 * {@linkplain model.Fish#Fish(Fish)}
 * {@linkplain model.Fish#Fish(int)}  
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Fish {
	
	
    private int healthIncrease;		//  represents the quantity of food represented by fish

    

	/**
	 *A constructor which creates an Object type of fish which has been assigned an integer value 
	 *(in the its field healthIncrease)
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @param health representing the quantity of food in a fish/or a group of fish
	 * @return
	 */
    public Fish(int health) {
        this.healthIncrease = health;
    }

    
    
    /**
	 *A constructor which creates an Object type of fish .It uses this {@linkplain model.Fish#Fish(int)}
	 *constructor for creating a standard object Fish containing 20 -quantity of food in this fish object.   
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return
	 */
    public Fish() {
        this(20);
    }

    
    
    /**
	 *A getter method which returns the attribute {@linkplain model.Fish#healthIncrease}  of the Class 
	 *{@linkplain model.Fish}. 
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the value of the food in fish which the object fish has(the points of health that can give to a 
	 * Civilization)
	 */
    public int getHealth() {
        return healthIncrease;
    }
}
