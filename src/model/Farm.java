package model;


/**
 * This class is a subclass of the class {@linkplain model.Building}.This class represents a special type of Building
 * which is the Farm.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 * 
 */
class Farm extends Building{

	
	
	/**
	 * A constructor of this class which creates an object taking an object type of  {@linkplain model.Civilization}
	 * ,which is the owner of the object being created.This constructor uses the constructor of the ancestor class
	 *  {@linkplain model.Building#Building(int, Civilization, int, int, int, int, int, int)}.The object of this class
	 *  created by this constructor have 200 points of health initially and 10 points of food and happiness generation.
	 *  
	 * @author valentinos Pariza
	 * @since 2/4/2018
	 * 
	 * 
	 */
	public Farm(Civilization owner) {
		
		super(200,owner,0,0,10,0,0,10);
		
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
	public String toString() {
		return "Farm. "+super.toString();
	}

	
	
	/**
     * This class is implemented here,inherited from the superclass.
     * This method returns a special character representing the object which calls this method
     * ( type of{@linkplain model.Farm})
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character representing the object calling this method(type of {@linkplain model.Farm}
     */
	@Override
	public char symbol() {
	
		return '+';
	}

	
	
	/**
	 * This method is used for investment on a building type of this class.By calling this method the food generation
	 * of this building is increased for 2 points(uses method  {@linkplain model.Building#getFoodGeneration()} and 
	 *  {@linkplain model.Building#setFoodGeneration(int)}).
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
	@Override
	public void invest() {
		this.setFoodGeneration(this.getFoodGeneration()+2);
		
	}
}
