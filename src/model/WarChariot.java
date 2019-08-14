package model;



/**
 * This class inherits from class  {@linkplain model.RangedUnit}.This class represents the special
 * RangedUnit War Chariot..
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class WarChariot extends RangedUnit {

	private static final int BASE_ENDURANCE_RATE=2;			// the increase rate of baseEndurance of this special 
															//  MilitaryUnit
	
	

	/**
	 * A constructor for objects of this class which uses constructor of the base class 
	 * {@linkplain model.WarChariot#WarChariot(Civilization)}.Also this method increase the base endurance of this 
	 * object updating the baseEndurance attribute by the rate of 2 of the initial.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of Civilization which owns this MilitaryUnit 
     * 
     */
	public WarChariot(Civilization civil) {
		super(civil);
		this.increaseBaseEndurance( (int)(this.getBaseEndurance()*BASE_ENDURANCE_RATE-this.getBaseEndurance()) );
		
	}
	
	
	/**
     * This class is implemented here,inherited from the superclass.
     * This method returns a special character representing the object which calls this method
     * 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character representing the object calling this method
     */
	public char symbol() {
		return 'W';
	}
	
	
	
	 /**
	    * 
	    * This method creates a String by using also the method {@linkplain model.RangedUnit} which represents 
	    * this object and returns it.
	    * 
	    * @author valentinos Pariza
	    * @since 2/4/2018
	    * @return String representation of the object type of this class
	    */
	public String toString() {
		return "War Chariot Unit. "+super.toString();
	}
	
}
