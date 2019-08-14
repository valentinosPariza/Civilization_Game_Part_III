package model;


/**
 * This class is a subclass of the class  {@linkplain model.mapObject}.This class represents the general units of 
 * a Civilization and its abilities.Although object of this class can not be created directly because this class is 
 * abstract.Every unit needs for its creation a unique amount of Resources,gold,happiness,food etc.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
abstract class Unit extends MapObject {
	
    private int baseEndurance;				//	the basic increase endurance of a unit
    
    private int endurance;					// the available endurance of a unit
    
    private int pay;						//  the amount of coins are needed for paying the unit
    
    private int initialGoldCost;			// the initial gold cost of creating the unit
    
    private int initialFoodCost;			//  the initial food cost of creating the unit
    
    private int initialResourceCost;		//  the initial food cost of creating the unit
    
    private int initialHappinessCost;		//  the initial happiness cost of creating the unit
    
    private boolean canAttack;				//  the ability of this unit to attack.Can attack?

    
    /**
     * This constructor creates an object of this class.It uses the constructor of the ancestor class 
     * {@linkplain model.MapObject#MapObject(int, Civilization)}.It takes all the attributes of this object by the 
     * parameters and assigns them.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return
     * @param health the points of health of the object
     * @param owner the Civilization(object) which it owns
     * @param baseEndurance the endurance which will replenish the unit
     * @param pay the cost of coins which will need for replenishing the unit
     * @param initialGoldCost the initial amount of gold for creating the unit
     * @param initialFoodCost the initial amount of food for creating the unit
     * @param initialResourceCost the initial amount of resources for creating the unit
     * @param initialHappinessCost the initial amount of happiness for creating the unit
     * 
     */
    public Unit(int health, Civilization owner, int baseEndurance, int pay,
        int initialGoldCost, int initialFoodCost, int initialResourceCost,
        int initialHappinessCost) {
        super(health, owner);
        this.baseEndurance = baseEndurance;
        this.endurance = baseEndurance;
        this.pay = pay;
        this.initialGoldCost = initialGoldCost;
        this.initialFoodCost = initialFoodCost;
        this.initialResourceCost = initialResourceCost;
        this.initialHappinessCost = initialHappinessCost;
    }

    
    
    /**
     * A constructor for creating an object of this class calling the constructor   
     * {@linkplain model.Unit#Unit(int, Civilization, int, int, int, int, int, int)} of this class.The unit which is 
     * created by this constructor has 30 points of health,5 points of base endurance, of cost coins, and of food
     * ,10 points of cost resources ,0 happiness cost,7 points of initial cost coins.Also this method takes the 
     * Civilization which this unit belongs to.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public Unit(Civilization owner) {
        this(30, owner, 5, 5, 7, 5, 10, 0);
    }

    
    /**
     * 
     * This method calls  {@linkplain model.Treasury#spend(int)} for spending the amount of gold as indicated 
     * by the attribute of paying gold,which was initialized in the construction of the object calling this method.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public void consumeResources() {
        getOwner().getTreasury().spend(pay);
    }

    
    
    /**
     * This method calls the methods  {@linkplain model.Unit#consumeResources()} and  
     * {@linkplain model.Unit#regenerateEndurance()}
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    @Override
    public void tick() {
        consumeResources();
        regenerateEndurance();
    }
    
    
    
	/**
	 * This method is used to regenerate the endurance of the unit by the amount of the base Endurance which was
	 * defined in the creation of the object calling this method
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public void regenerateEndurance() {
        this.endurance = this.baseEndurance;
    }

    
	/**
	 * 
	 * This method returns if the unit which calls the method is able to attack
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the object can attack or false otherwise
     * 
     */
    public boolean getCanAttack() {
        return this.canAttack;
    }

    
    
	/**
	 * This method updates the statue if the unit can Attack,(of the unit calling this method) by the boolean value
	 * which is given as parameter.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param canAttack a boolean value which updates the statue of the unit if it can attack
     */
    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

	/**
	 * Returns the available endurance of the unit which calls the method
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a integer number representing the endurance of this unit
     */
    public int getEndurance() {
        return this.endurance;
    }

    
    
    /**
	 * Returns the base endurance of the unit which calls the method
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a integer number representing the base endurance of this unit
     */
    public int getBaseEndurance() {
        return this.baseEndurance;
    }

    
	/**
	 * This method examines whether the unit have enough endurance to move and sends the result of the examination
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the unit can move,false otherwise
     */
    public boolean canMove(int enduranceCost) {
        return endurance >= enduranceCost;
    }

    
	/**
	 * This method changes the value of the base Endurance as indicated by the parameter
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param baseEndurance integer number which represents the new bas Endurance of the unit
     * 
     */
    public void setBaseEndurance(int baseEndurance) {
        this.baseEndurance = baseEndurance;
    }

    
    
	/**
	 * This method reduces the amount of the endurance of the unit which calls the method by the value of the parameter
	 * given.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param reduction integer number which will reduce the amount of the current endurance of the unit by the amount 
     * 		  which represents
     */
    public void deductEndurance(int reduction) {
        this.endurance -= reduction;
    }

    
	/**
	 * This method returns the initial gold cost of the unit
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the initial gold cost of the unit
     */
    public int getInitialGoldCost() {
        return this.initialGoldCost;
    }

    
    /**
	 * This method returns the initial food cost of the unit
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the initial food cost of the unit
     */
    public int getInitialFoodCost() {
        return this.initialFoodCost;
    }

    
    /**
	 * This method returns the initial resource cost of the unit
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the initial resource cost of the unit
     */
    public int getInitialResourceCost() {
        return this.initialResourceCost;
    }

    
    /**
	 * This method returns the initial happiness cost of the unit.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the initial happiness cost of the unit
     */
    public int getInitialHappinessCost() {
        return this.initialHappinessCost;
    }

    
	/**
	 * This method uses the method  {@linkplain model.MapObject#getOwner()} to get the Civilization of the object 
	 * calling this method and examine whether the Civilization has enough coins,food,resources and happiness points 
	 * to create this unit.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if this unit can be created or false otherwise
     */
    public boolean isAffordable() {
        Civilization owner = getOwner();
        return owner.getTreasury().getCoins() >= initialGoldCost
            && owner.getFood() >= initialFoodCost
            && owner.getResources() >= initialResourceCost
            && owner.getHappiness() >= initialHappinessCost;
    }

    
	/**
	 * This method applies the initial costs of the unit to the Civilization which owns it by reducing the amount 
	 * of gold,food,resources and happiness of the Civilization to the indicated amount of the attributes of the unit. 
	 * 
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public void applyInitialCosts() {
        getOwner().getTreasury().spend(initialGoldCost);
        getOwner().eat(initialFoodCost);
        getOwner().dockResources(initialResourceCost);
        getOwner().dockHappiness(initialHappinessCost);
    }

    
    
	 /**
     * 
     * This method creates a String with the abilities of this unit by using also the method 
     * {@linkplain model.MapObject} which represents this object and returns it.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return String representation of the object type of this class
     */
    @Override
    public String toString() {
        return "Unit. Endurance: " + endurance + ". " + "Can Attack: "
            + canAttack + ". " + super.toString();
    }
    
    
    
    /**
     * Increases the amount of baseEndurance of the Unit by the value of the parameter
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param baseEnduranceIncrease an integer number which indicates the increase of the base endurance by the value
     * 		 which represents
     */
    public void increaseBaseEndurance(int baseEnduranceIncrease)
	{
		this.baseEndurance+=baseEnduranceIncrease;
	}
}
