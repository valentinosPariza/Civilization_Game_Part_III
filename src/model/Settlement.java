package model;
/**
 * 
 * This class is a subclass of {@linkplain model.Building} class.This class represents the settlements and some 
 * operations on it.Each settlement has a name and a number of buildings in it.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class Settlement extends Building {
	
    private String name;								// the name of the settlement		
    private int numBuildings;							//  the number of the buildings on the settlement
    

    
    /**
     * Constructor for creating a settlement on a Civilization object(which is given) and with a specific name given 
     * as a parameter.This constructor uses a constructor of the parent class {@linkplain model.Building} ,the 
     * {@linkplain model.Building#Building(int, Civilization, int, int, int, int, int, int)}.Every settlement has 
     *  200 pointsfor health initially and 10 points for gold generation(this is achieved through the method mentioned).
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of {@linkplain model.Civilization} which it is the owner of this settlement
     * @param name a String which will be the name of the settlement
     */
    public Settlement(Civilization owner, String name) {
        super(200, owner, 10, 0, 0, 0, 0, 10);
        this.name = name;
        numBuildings = 0;
    }

    
    /**
     * This method is defined in this class but its signature was given in {@linkplain model.Building}.This class is 
     * used to represent the upgrade of a Building type of {@linkplain model.Settlement} and the advantages which the
     * upgrade gives.This method increases the generation points in philosophy ,plus 5(use tmethod 
     * {@linkplain model.Building#setPhilosophyGeneration(int)}) and 
     * {@linkplain model.Building#getPhilosophyGeneration()}) ,increases the number of buildings in the Settlement 
     * objectand also increase the gold generation plus 5 using methods {@linkplain model.Building#getGoldGeneration()}
     * and {@linkplain model.Building#setGoldGeneration(int)}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    @Override
    public void invest() {
        setPhilosophyGeneration(getPhilosophyGeneration() + 5);
        numBuildings++;
        setGoldGeneration(getGoldGeneration() + 5);
    }

    
    /**
     * This class is implemented here,inherited from the superclass.
     * This method returns a special character representing the object which calls this method
     * ( type of{@linkplain model.Settlement})
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character representing the object calling this method(type of {@linkplain model.Settlement}
     */
    @Override
    public char symbol() {
        return '$';
    }

    
    
    
    /**
     * Returns the name of the settlement object which calls this method
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which is the name of the settlement object which calls this method
     */
    public String getName() {
        return name;
    }

     
     
    /**
     * This method returns the number of buildings on the settlement object which calls this method
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an integer number representing the number of buildings on the settlement object which calls this method
     */
    public int getNumBuildings() {
        return numBuildings;
    }

    
    
    /**
     * 
     * This method creates a String by using also the method {@linkplain model.Building#toString()} which represents 
     * this object and returns it.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return String representation of the object type of this class
     */
    @Override
    public String toString() {
        return name + " Settlement. " + super.toString();
    }
}
