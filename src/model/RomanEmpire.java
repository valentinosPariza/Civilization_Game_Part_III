package model;

import java.util.Random;
/**
 * This class extends the Civilization class.This means that this class is a subclass of the 
 * {@linkplain model.Civilization} class.This class represents a special type of Civilization,the Roman Empire
 * .Although it has some new characteristics and some new versions of operations(overridden methods).
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 * 
 */
class RomanEmpire extends Civilization{
  

    private Hills hills = new Hills();   	 // special place of Roman Empire are the Hills and its operations

    
    /**
     * A no-parameter constructor which creates an object type of this class
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public RomanEmpire() {
       super("Roman Empire");
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
     *coals.It uses the method {@linkplain model.Hills#mineCoal()} to find coals in hills and then store this amount 
     *of coals to the Resources of this Civilization.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String presenting the amount of coals which were gained in Hills(using the object 
     * {@linkplain model.Hills})
     * 
     * 
     */
    public String explore() {
    	int earnings=this.hills.mineCoal();
    	this.produceResources(earnings);
    	
    	return "You explored hills and you earned "+earnings+" coal";
    }
 

    /**
     *  This method is overridden.
     * This method returns an object of the special MilitaryUnit of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.MilitaryUnit},more specific the special Landmark of this 
     * Civilization which is {@linkplain model.LegionUnit}
     */
    public MeleeUnit getMeleeUnit() {
    	return new LegionUnit(this);
    }

    
    
    /**
     *  This method is overridden.
     * This method returns an object of the special Landmark of the Civilization object which calls the method 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of {@linkplain model.Landmark},more specific the special Landmark of this Civilization
     *  which is {@linkplain model.Coliseum}
     */
    public Landmark getLandmark() {
        return new Coliseum(this);
    }
}
