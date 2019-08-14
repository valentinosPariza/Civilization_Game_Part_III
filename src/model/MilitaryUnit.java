package model;


/**
 * This class is an abstract class which inherits from  {@linkplain model.Unit}.This class represents the special
 * Unit ,the MilitaryUnit which can attack ,unlike with usual Unit objects.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
abstract class MilitaryUnit extends Unit{
	
	private int damage;			// the damage which a MilitaryUnit can cause
	
	
	/**
	 * A constructor of this class which uses the constructor  
	 * {@linkplain model.MilitaryUnit#MilitaryUnit(int, Civilization, int, int, int, int, int, int)}.Creates a 
	 * MilitaryUnit object with health as indicated by the parameter,which owns to a new Civilization named "Default"
	 * which has 5 points of baseEndurance,of gold cost,of food cost,7 points cost of initial gold creation cost and
	 * 10 cost points for initial resource cost.Last its damage is set to as 10.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
	public MilitaryUnit(int health) { 
		super(health, new Civilization("Default"), 5, 5, 7, 5, 10, 10);
	}

	
	/**
	 * A constructor of an object of this class which takes the parameters and creates the object by using the 
	 * constructor of the base class  {@linkplain model.Unit#Unit(int, Civilization, int, int, int, int, int, int)}.
	 * It has initial happiness cost 10 points.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param health the health of the MilitaryUnit
     * @param owner	the civilization which is owner of this MilitaryUnit
     * @param baseEndurance the points of base Endurance of this MilitaryUnit
     * @param pay the cost in coins for replenishing the endurance of this MilitaryUnit
     * @param initialGoldCost the initial cost in coins for creating an object of this MilitaryUnit
     * @param initialFoodCost the initial food cost for creating an object of this MilitaryUnit
     * @param initialResourceCost the initial resources cost for creating an object of this MilitaryUnit
     * @param damage the damage which this object can cause
     * 
     */
	public MilitaryUnit(int health, Civilization owner, int baseEndurance, int pay, int initialGoldCost,
	int initialFoodCost, int initialResourceCost,int damage) {

	super(health, owner, baseEndurance, pay, initialGoldCost, initialFoodCost, initialResourceCost, 10);

	this.damage=damage;
	}

	
	/**
	 * This method returns the damage which a MilitaryUnit can cause 
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an integer number which representsthe damage which the MilitaryUnit can cause
     */
	public int getDamage() {
		
		return this.damage;
	}
	
	
	/**
	 * This method increases the damage of the MilitaryUnit object which invokes the method
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param damage represents the amount of damage which increases the present damage of the MilitaryUnit object 
     */
	public void increaseDamage(int damage) {
		this.damage+=damage;
	}
	
	
	/**
	 * This method is used to set the MilitaryUnit back to its condition of endurance by charging the civilization 
	 * with additional costs.It uses the method  {@linkplain model.Unit#tick()} from the superclass.Also sets the 
	 * ability of this MilitaryUnit to attack to true by calling method {@linkplain model.Unit#setCanAttack(boolean)}.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
	public void tick() {
		
		super.tick();
		this.setCanAttack(true);
	}
	
	/**
	 * This method is going to be defined in lower level.It should represent the battle between the object type of this 
	 * class which calls this method against the object type of {@linkplain model.MapObject} which is given as a
	 *  parameter.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param object type of {@linkplain model.MapObject} which is going to be used as the opponent in the battle
     * 			of the object ehich calls this method
     * 
     */
	public abstract void battle(MapObject obj);
	
	
	
	/**
	 * This method represents the attack operation of a MilitaryUnit object against other Unit or Building.This method
	 * calls the method  {@linkplain model.MilitaryUnit#battle(MapObject)} which is defined in lower level for 
	 * simulating the battle and also increases the strategy points of the Civilization calling the method  
	 * {@linkplain model.Strategy#battle()} on the Strategy object of the Civilization object.Moreover it sets the
	 * ability to attack of this MilitaryUnit to false for this round(using the method  
	 * {@linkplain model.MilitaryUnit#setCanAttack(boolean)} .
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param an object type of {@linkplain model.MapObject} on which the attack is made.
     */
	public void attack(MapObject obj) {
		
		this.getOwner().getStrategy().battle();
		this.battle(obj);
		this.setCanAttack(false);
		
	}

	
	
	/**
     * 
     * This method creates a String by using also the method {@linkplain model.Unit} which represents 
     * this object and returns it.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return String representation of the object type of this class
     */
	public String toString() {
		
		return "Military Unit. "+super.toString();
		
	}
	
	

}
