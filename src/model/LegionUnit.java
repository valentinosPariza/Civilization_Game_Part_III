package model;


/**
 * This class inherits from class  {@linkplain model.MeleeUnit}.This class represents the special
 * MeleeUnit Legion.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class LegionUnit extends MeleeUnit{

	private static final double EXTRA_LEGION_DAMAGE_RATE=1.5;
	
	
	/**
	 * A constructor for objects of this class which uses constructor of the base class 
	 * {@linkplain model.WarChariot#WarChariot(Civilization)}.Also this method increase the damage which can cause this 
	 * object updating the damage attribute by the rate of 1.5 of the initial.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of Civilization which owns this MilitaryUnit 
     * 
     */
	public LegionUnit(Civilization civil) {
		super(civil);
		
		increaseDamage((int)(super.getDamage()*EXTRA_LEGION_DAMAGE_RATE)-getDamage());
		
	}
	
	
	
	
	  /**
     * This method is implemented in this class but given from a superclass.This method represents the battle 
     * against two objects.The object which calls this method attacks to other object type of  
     * {@linkplain model.MapObject}.This method damages the other object given in parameter and the object 
     * after is attacked it may attack back if it is not destroyed after the attack and is an object type  of  
     * {@linkplain model.MeleeUnit}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} which the object which calls the method attacks
     * 
     */
 public void battle(MapObject obj) {
		
		obj.damage(this.getDamage());
		
		if((!obj.isDestroyed())&&( obj instanceof MeleeUnit  ))
		{
			this.damage( ((MilitaryUnit)obj).getDamage() );
		}
		
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
	
	return 'L';
	
  }
	
  
  
  /**
   * 
   * This method creates a String by using also the method {@linkplain model.MeleeUnit} which represents 
   * this object and returns it.
   * 
   * @author valentinos Pariza
   * @since 2/4/2018
   * @return String representation of the object type of this class
   */
  public String toString() {
	  
	  return "Legion. "+super.toString();
	  
  }
  

}
