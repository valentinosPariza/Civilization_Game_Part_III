package model;



/**
 * This class is a subclass of the class {@linkplain model.Landmark}.This class is a special type of Landmark 
 * representing the Coliseum of Roman Empire and its operations.
 * 
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class Coliseum extends Landmark{

	
	
	/**
	 * This constructor creates an object of this class by calling the constructor of the superclass  
	 * {@linkplain model.Landmark#Landmark(Civilization)}with parameter as the parameter given.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of  {@linkplain model.Civilization} on which the special type of Landmark will belong
     * 
     */
	public Coliseum(Civilization owner) {
		super(owner);
		
	}

	
	/**
     * 
     * This method creates a String by using also the method {@linkplain model.Landmark#toString()} which represents 
     * this object and returns it.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return String representation of the object type of this class
     */
	public String toString()
	{
		return "Coliseum. "+super.toString();
	}
	
	
	
	
	/**
	 * This method is used for investment on a building type of this class.This method calls the method
	 * {@linkplain model.Landmark#invest()} of the ancestor and increases for one time due to investment the happiness
	 * points of the Civilization by calling the method {@linkplain model.Civilization#increaseHappiness(int)} on the 
	 * object type  of  {@linkplain model.Civilization} of the owner Civilization.The increase of happiness points is 
	 * made only the first time which this method is called on the object.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
	public void invest() {
		
		super.invest();
		
		if(this.getIsLandmarkInvested()) {
			getOwner().increaseHappiness(50);
			this.setIsLandmarkInvested();
		}
		
	}
}
