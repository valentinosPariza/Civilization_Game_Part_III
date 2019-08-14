package model;


/**
 * This class inherits from class Building.Is a special Type of Building.In this class a CoalMine is being represented 
 * and also its operation.it uses many characteristics which it inherits and but also define new one such as
 * {@linkplain model.CoalMine#COAL} and {@linkplain model.CoalMine#burnCost}.
 * 
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 *
 */
class CoalMine extends Building {
	
    private static final int COAL = 20;
    
    private int burnCost = 10;

    
   /**
    *  Creates an object type of CoalMine which appeals to a Civilization which is given as a parameter.With the 
    *  creation of the object type of CoalMine some characteristics of the building are given such as health which is
    *  200 for CoalMine.This constructor calls the super constructor(Parental constructor) for creating an object 
    *  type of Building which at the End that object will be "wrapped" by the object CoalMine.
    *  
    *  
    * @author valentinos Pariza
	* @since 1/4/2018
    * @param owner an object type of {@linkplain model.Civilization} which is used in order to create a CoalMine
    * 		 which appeals to this Civilization 
    */
    public CoalMine(Civilization owner) {
        super(200, owner, 0, 0, 0, 0, 0, 0);
        setResourceGeneration(COAL - burnCost);
    }

    
    /**
     * This method is overridden(taken from a class which is parent) into a new version for the objects type of
     *  CoalMine.A method for representing the invest on a building type of  CoalMine and the advantages which are 
     *  being  accomplished by the investment.Every time which an investment is made burnCost is reduced and the rate
     * of resource generation is increased for coals.
     * 
     * @author valentinos Pariza
	 * @since 1/4/2018
	 * 
     */
    @Override
    public void invest() {
        if (burnCost > 0) {
            burnCost -= 1;
        }
        setResourceGeneration(COAL - burnCost);
    }

    
    /**
     * A method for returning the symbol of a CoalMine represented on a map
     * 
     * @author valentinos Pariza
	 * @since 1/4/2018
     * @return a character(type of char) which represents the CoalMine
     */
    @Override
    public char symbol() {
        return '(';
    }

    
	/**
	 * Returns the amount of coals needed for operating the function of burn
	 * 
	 * @author valentinos Pariza
	 * @since 1/4/2018
	 * @return the value of coals which are needed for using the Burn operation one time.
	 * 
	 * 
	 */
    public int getBurnCost() {
        return burnCost;
    }

    
    /**
	 * Returns the amount of constant {@linkplain model.CoalMine#COAL}(which is 20)
	 * 
	 * @author valentinos Pariza
	 * @since 1/4/2018
	 * @return the amount of coals which constant {@linkplain model.CoalMine#COAL}(is equal to 20) represents 
	 */
    public int getCoal() {
        return COAL;
    }

    
    
    /**
     * A method for returning the String representation of CoalMine and also the String representation of the object 
     * behind object CoalMine.CoalMine is also an object Type of Building and of CoalMine of course. 
     * 
     * 
     * @author valentinos Pariza
	 * @since 1/4/2018
     * @return a String representation of the object type of {@linkplain model.CoalMine} which calls the method
     */
    @Override
    public String toString() {
        return "Coalmine. " + super.toString();
    }
}
