package model;


/**
 * This class inherits from class  {@linkplain model.MilitaryUnit}.This class represents the special
 * MilitaryUnit rangedunit.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class RangedUnit extends MilitaryUnit{

	
	

	/**
	 * A constructor for objects of this class which uses constructor of the base class 
	 * {@linkplain model.MilitaryUnit#MilitaryUnit(int, Civilization, int, int, int, int, int, int)}.It has 100 points
	 * of health,10 points of base endurance,10 gold cost,14 initial gold cost,5 initial food cost,0 initial resource 
	 * cost and damage 30.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of Civilization which owns this MilitaryUnit 
     * 
     */
	public RangedUnit(Civilization civil)
	{
		super(100,civil,10,10,14,5,0,30);
		
	}
	
	
	
	 /**
	    * 
	    * This method creates a String by using also the method {@linkplain model.MilitaryUnit} which represents 
	    * this object and returns it.
	    * 
	    * @author valentinos Pariza
	    * @since 2/4/2018
	    * @return String representation of the object type of this class
	    */
	public String toString() {
		
		return "RangedUnit. "+super.toString();
		
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
	@Override
	public char symbol() {
		
		return 'R';
	}

	
	
	  /**
     * This method is implemented in this class but given from a superclass.This method represents the battle 
     * against two objects.The object which calls this method attacks to other object type of  
     * {@linkplain model.MapObject}.This method damages the other object given in parameter and the object 
     * after is attacked it may attack back if it is not destroyed after the attack and is an object type  of  
     * {@linkplain model.RangedUnit} or{@linkplain model.Hybridunit}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} which the object which calls the method attacks
     * 
     */
	@Override
   public void battle(MapObject obj) {
		
		obj.damage(this.getDamage());
		
		if((!obj.isDestroyed())&&((obj instanceof RangedUnit)||(obj instanceof HybridUnit) ))
		{
			this.damage( ((MilitaryUnit)obj).getDamage() );
		}
		
	}
	
}
