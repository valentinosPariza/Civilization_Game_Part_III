package model;



/**
 * This class inherits from class  {@linkplain model.SiegeUnit}.This class represents the special
 * SiegeUnit Black Powder Unit..
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
 class BlackPowderUnit extends SiegeUnit {

	 
	 
	 /**
		 * A constructor for objects of this class which uses constructor of the base class 
		 * {@linkplain model.WarChariot#WarChariot(Civilization)}.
		 * 
	     * @author valentinos Pariza
	     * @since 2/4/2018
	     * @param owner an object type of Civilization which owns this MilitaryUnit 
	     * 
	     */
	public BlackPowderUnit(Civilization civil) {
		super(civil);
	}

	
	
	
	
	 /**
     * This method is implemented in this class but given from a superclass.This method represents the battle 
     * against two objects.The object which calls this method attacks to other object type of  
     * {@linkplain model.MapObject}.This method damages the other object given in parameter but the other object can
     * not attack back.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} which the object which calls the method attacks
     * 
     */
	public void battle(MapObject obj) {

		obj.damage(this.getDamage());

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
		return 'B';
	}

	
	
	 /**
	    * 
	    * This method creates a String by using also the method {@linkplain model.SiegeUnit} which represents 
	    * this object and returns it.
	    * 
	    * @author valentinos Pariza
	    * @since 2/4/2018
	    * @return String representation of the object type of this class
	    */
	public String toString() {
		return "Black Powder Unit. " + super.toString();
	}

}
