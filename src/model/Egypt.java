package model;

/**
 * This class extends the Civilization class.This means that this class is a subclass of the 
 * {@linkplain model.Civilization} class.This class represents a special type of Civilization,the Egypt.Although it 
 * has some new characteristics and some new versions of operations(overridden methods) .
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 * 
 */
class Egypt extends Civilization{
 

    private Desert desert = new Desert();			// special place of Egypt is the Desert and its operations

    /**
     * A no-parameter constructor which creates an object type of this class
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public Egypt() {
        super("Egypt");
    	
    }

    
    /**
     * This method  increases the coins of this civilization by the amount of coins which were gained in Desert.If 
     * were gained.This method calls method {@linkplain model.Desert#findTreasure()} for trying to find coins in Desert
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String presenting the amount of gold-coins which were gained in desert
     * 
     */
    public String explore() {
    	int earnings=this.getDesert().findTreasure();
    	this.getTreasury().earn(earnings);
    	
    	return "You explore Desert and you earned "+earnings+" coins";
    }
    
    
    /**
     * This method is a getter method.It returns the special place of this Civilization which is the Desert
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.Desert}
     * 
     */
    public Desert getDesert() {
        return desert;
    }

   
    /**
     * This method is overridden.
     * This method returns an object of the special MilitaryUnit of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.MilitaryUnit},more specific the special Landmark of this 
     * Civilization which is {@linkplain model.}
     */
    public RangedUnit getRangedUnit() {
        return new WarChariot(this);
    }

    
    /**
     * This method is overridden.
     * This method returns an object of the special Landmark of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.Landmark},more specific the special Landmark of this Civilization
     *  which is {@linkplain model.Pyramid}
     */
    public Landmark getLandmark() {
        return new Pyramid(this);
    }
    
    

  

}
