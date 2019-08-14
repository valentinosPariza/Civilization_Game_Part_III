package model;

import java.util.Random;

/**
 * This class extends the Civilization class.This means that this class is a subclass of the 
 * {@linkplain model.Civilization} class.This class represents a special type of Civilization,the Chinese Dynasty
 * .Although it has some new characteristics and some new versions of operations(overridden methods).
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 * 
 */
class QinDynasty extends Civilization{
  

    private Hills hills = new Hills();    // special place of Chinese Dynasty are the Hills and its operations

    
    /**
     * A no-parameter constructor which creates an object type of this class
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public QinDynasty() {
       super("Chinese Dynasty");
    }

    /**
     * This method is a getter method.It returns the special place of this Civilization which are the Hills 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.Hills}
     * 
     */
    public Hills getHills() {
        return hills;
    }

    
    /**
     *This method uses an object type of{@linkplain model.Hills} which is a special place of this Civilization ,to find
     * food(by using method {@linkplain model.Hills#hunt()} and {@linkplain model.Game#getHealth()}) and store the 
     * amount of food to the Food attribute of the Civilization .Also it uses the method 
     * {@linkplain model.Hills#replenishGame()} to refill the Hills with objects type of {@linkplain model.Game}
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String presenting the amount of food which was gained in Hills(using the object 
     * {@linkplain model.Hills})
     * 
     * 
     */
    public String explore() {
    	
    	if(!this.hills.replenishGame())
    	{
    		int foodGained=this.hills.hunt().getHealth();
    		this.makeFood(foodGained);
    		
    		return "You have gained in hunting "+foodGained+" food";
    	}
    	else return "You haven't found any food in hills";
    }
    

    
    /**
     *  This method is overridden.
     * This method returns an object of the special MilitaryUnit of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.MilitaryUnit},more specific the special Landmark of this 
     * Civilization which is {@linkplain model.BlackPowderUnit}
     */
    public SiegeUnit getSiegeUnit() {
    	
        return new BlackPowderUnit(this);
        
    }
    
    
    /**
     *  This method is overridden.
     * This method returns an object of the special Landmark of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.Landmark},more specific the special Landmark of this Civilization
     *  which is {@linkplain model.GreatWall}
     */
    public Landmark getLandmark() {
        return new GreatWall(this);
    }

    

   

  

 

}
