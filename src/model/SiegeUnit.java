package model;



/**
 * This class inherits from class  {@linkplain model.MilitaryUnit}.This class represents the special
 * MilitaryUnit SiegeUnit.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class SiegeUnit extends MilitaryUnit{

	
	

	/**
	 * A constructor for objects of this class which uses constructor of the base class 
	 * {@linkplain model.MilitaryUnit#MilitaryUnit(int, Civilization, int, int, int, int, int, int)}.It has 200 points
	 * of health,5 points of base endurance,10 gold cost,14 initial gold cost,5 initial food cost,10 initial resource 
	 * cost and damage 60.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of Civilization which owns this MilitaryUnit 
     * 
     */
	public SiegeUnit(Civilization civil)
	{
		super(200,civil,5,10,14,5,10,60);
	
	
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
		
		return 'S';
	}

	
	
	 /**
     * This method is implemented in this class but given from a superclass.This method represents the battle 
     * against two objects.The object which calls this method attacks to other object type of  
     * {@linkplain model.MapObject} and more specific only on objects type of  {@linkplain model.Building} .This method 
     * damages the other object given in parameter and the object after is attacked it can not attack back.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} which the object which calls the method attacks
     * 
     */
	@Override
	public void battle(MapObject obj) {
		
		if(obj instanceof Building)
		{
			obj.damage(this.getDamage());
		}
	}
	
	
	
	/**
	 * This method is overridden.
	 * This method represents the attack operation of a MilitaryUnit object against other Unit or Building.This method
	 * calls the method  {@linkplain model.MilitaryUnit#battle(MapObject)} which is defined in lower level for 
	 * simulating the battle and also increases the strategy points of the Civilization calling the method  
	 * {@linkplain model.Strategy#siege()} on the Strategy object of the Civilization object.Moreover it sets the
	 * ability to attack of this MilitaryUnit to false for this round(using the method  
	 * {@linkplain model.MilitaryUnit#setCanAttack(boolean)} .
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} on which the attack is made.
     */
	public void attack(MapObject obj) {
		
		this.getOwner().getStrategy().siege();
		this.battle(obj);
		this.setCanAttack(false);
		
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
		
		return "SiegeUnit. "+super.toString();
		
	}

}
