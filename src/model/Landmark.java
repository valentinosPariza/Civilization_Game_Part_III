package model;



/**
 * This class is a subclass of the class {@linkplain model.Building}.This class represents a speicial type of Building
 *  the Landmark.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 * 
 */
class Landmark extends Building{

	private boolean isLandmarkInvested;
	
	/**
	 * A constructor of this class which creates an object taking an object type of  {@linkplain model.Civilization}
	 * ,which is the owner of the object being created.This constructor uses the constructor of the ancestor class
	 *  {@linkplain model.Building#Building(int, Civilization, int, int, int, int, int, int)}.The object of this class
	 *  created by this constructor have 200 points of health initially and 10 points of technology and happiness 
	 *  generation.
	 *  
	 * @author valentinos Pariza
	 * @since 2/4/2018
	 * 
	 * 
	 */
	public Landmark(Civilization owner)
	{
		super(200,owner,0,0,0,10,0,10);
		
		this.isLandmarkInvested=false;
		
	}
	
	
	/**
	 * This method returns if the Landmark was invested for the first time
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     *@return true if the building was invested for one time at least,otherwise false
     */
	public boolean getIsLandmarkInvested() {
		return this.isLandmarkInvested;
	}
	
	
	/**
	 * This method sets the flag(boolean variable) to true ,which means that the landmark was invested  
	 * for at least one time
	 *  
     * @author valentinos Pariza
     * @since 2/4/2018
     *
     *
     */
	public void setIsLandmarkInvested() {
		this.isLandmarkInvested=true;
	}
	
	 /**
     * This class is implemented here,inherited from the superclass.
     * This method returns a special character representing the object which calls this method
     * ( type of{@linkplain model.Landmark})
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character representing the object calling this method(type of {@linkplain model.Landmark}
     */
	@Override
	public char symbol() {
		
		return '!';
	}

	
	
	/**
	* This method is used for investment on a building type of this class.By calling this method the technology 
	* generation of this building is increased for 5 points(uses method  
	* {@linkplain model.Building#getTechPointGeneration()} and {@linkplain model.Building#setTechPointGeneration(int)}).
	* 
    * @author valentinos Pariza
    * @since 2/4/2018
    * 
    */
	@Override
	public void invest() {
		
		this.setTechPointGeneration(this.getTechPointGeneration()+5);
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
		return "LandMark. "+super.toString();
	}

	
}
