 package model;

import java.util.Random;
/**
 * 
 * This class is used to represent the different Civilizations,their characteristics(resources,technology and strategy 
 * points etc...) and their operations (explore the world for resources,battle etc...).Generally this is the most
 * important part-Class of each Civilization-Player because all the accomplishments,the resources and generally 
 * all the operations in the game are made on a Civilization.Furthermore this class is used indirectly because all 
 * the Civilizations  which are used are subclasses of this class.Although except of its importance for the structure 
 * of the game it is the superclass of the special Civilizations. 
 * 
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 * 
 */
class Civilization {

	 private static Random rand = new Random();
	
	  private String name;								// the name of the Civilization

	    private Technology technology = new Technology();
	    private Strategy strategy = new Strategy();
	    	
	    private int numSettlements=0;				// the number of the settlements of a civilization

	    private Treasury treasury = new Treasury(50);
	    private int food = 50;								// the resources(like Coals) and the food of a Civilization
	    private int resources = 50;
	    private int happiness = 50;					// the points of happiness of a Civilization
	    
	    
	     
	    /**
	     * Constructor of an object type  of Civilization
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018 
	     * @param name the name of the Civilization(Object type of Civilization) which is going to be created
	     */
	    public Civilization(String name)
	    {
	    	this.name=name;
	    }
	    
	    /**
	     * This method is used in order to send the Civilization to earn some resources.So it increases the amount of 
	     * resources of the object type of Civilization  by a pseudorandom value between 0 and 19(both inclusive) and 
	     * also return a String indicating that the resources where increased
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return a String which shows that the resources where increased
	     */
	    public String explore() {
	       this.resources += rand.nextInt(20);
	        return "You explore your surroundings and acquire some resources!";
	    }
	    
	    /**
	     * This method is a getter method which returns the name of the Civilization
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return the name of the Civilization
	     */
	    public String getName() {
	        return this.name;
	    }
	    
	    
	    /**
	     * This method returns the number of Settlements of the Civilization object which calls this method
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return the current number of settlements
	     */
	    public int getNumSettlements() {
	        return numSettlements;
	    }
	    
	    
	    /**
	     * This method increases by one the number of Settlements of the Civilization object which calls this method
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * 
	     */
	    public void incrementNumSettlements() {
	        numSettlements++;
	    }

	    /**
	     * This method decreases by one the number of Settlements of the Civilization object which calls this method
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * 
	     */
	    public void decrementNumSettlements() {
	        numSettlements--;
	    }
	    
	    
	    /**
	     * This method returns an object type of {@linkplain model.Treasury} which is an attribute of the Civilization
	     *  object which calls this method(Getter method)
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.Treasury} which is an attribute of the Civilization object which 
	     * calls this method.
	     */
	    public Treasury getTreasury() {
	        return treasury;
	    }

	    
	    /**
	     * This method returns an object type of {@linkplain model.Strategy} which is an attribute of the Civilization 
	     * object which  calls this method(Getter method).
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.Strategy} which is an attribute of the Civilization object which 
	     * calls this method.
	     */
	    public Strategy getStrategy() {
	        return strategy;
	    }

	    /**
	     * This method returns an object type of {@linkplain model.Technology} which is an attribute of the 
	     * Civilization  object which  calls this method(Getter method).
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.Technology} which is an attribute of the Civilization object
	     * which calls this method.
	     */
	    public Technology getTechnology() {
	        return technology;
	    }
	    
	    
	    
	    /**
	     * This method returns the points of happiness  of the  Civilization  object which  calls this method
	     * (Getter method).
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return the points of happiness  of the  Civilization
	     *
	     */
	    public int getHappiness() {
	        return this.happiness;
	    }

	    
	    /**
	     * This method returns the points of food  of the  Civilization  object which  calls this method
	     * (Getter method).
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return the points of food  of the  Civilization
	     *
	     */
	    public int getFood() {
	        return this.food;
	    }

	    
	    
	    /**
	     * This method returns the points of resources  of the  Civilization  object which  calls this method
	     * (Getter method).
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return the points of resources  of the  Civilization
	     *
	     */
	    public int getResources() {
	        return this.resources;
	    }
	    
	    
	    
	    /**
	     * This method reduces the amount of food of the  Civilization  object which calls this method by the amount
	     * which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of food which is decreases the food amount of the Civilization  object 
	     * which  calls this method
	     */
	    public void eat(int foodAmount) {
	        this.food -= foodAmount;
	    }

	    
	    /**
	     * This method increases the amount of food of the  Civilization  object which calls this method by the amount
	     * which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of food which increases the food amount of the  Civilization  object 
	     * which  calls this method
	     */
	    public void makeFood(int foodAmount) {
	        this.food += foodAmount;
	    }

	    
	    /**
	     * This method decreases the amount of Resources of the  Civilization  object which calls this method by the 
	     * amount which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of Resources which decreases the  amount of Resources of the  Civilization  
	     * object  which  calls this method
	     */
	    public void dockResources(int resourceAmount) {
	        this.resources -= resourceAmount;
	    }

	   
	    /**
	     * This method increases the amount of Resources of the  Civilization  object which calls this method by the 
	     * amount which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of Resources which increases the  amount of Resources of the  Civilization  
	     * object which  calls this method
	     */
	    public void produceResources(int resourceAmount) {
	        this.resources += resourceAmount;
	    }

	    
	    
	    /**
	     * This method decreases the points of happiness of the Civilization object which calls this method by the 
	     * amount of points which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of happiness which decreases the points of happiness of the  Civilization  
	     * object which calls this method
	     */
	    public void dockHappiness(int happinessAmount) {
	        this.happiness -= happinessAmount;
	    }

	    
	    /**
	     * This method increases the points of happiness of the Civilization object which calls this method by the 
	     * amount of points which is indicated by the parameter 
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @param foodAmount is the amount of happiness which increases the points of happiness of the  Civilization  
	     * object which calls this method
	     */
	    public void increaseHappiness(int happinessAmount) {
	        this.happiness += happinessAmount;
	    }
	    
	    
	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.MeleeUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.MeeleUnit} which refers to the Civilization object which calls 
	     * this method
	     * 
	     */
	    public MeleeUnit getMeleeUnit() {
	        return new MeleeUnit(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.RangedUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.RangeUnit} which refers to the Civilization object which calls 
	     * this method
	     * 
	     */
	    public RangedUnit getRangedUnit() {
	        return new RangedUnit(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.HybridUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.HybridUnit} which refers to the Civilization object which calls
	     *  this method
	     * 
	     */
	    public HybridUnit getHybridUnit() {
	        return new HybridUnit(this);
	    }

	    /**
	     * 
	     * This method returns a new type object of {@linkplain model.SiegeUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.SiegeUnit} which refers to the Civilization object which calls 
	     * this method
	     * 
	     */
	    public SiegeUnit getSiegeUnit() {
	        return new SiegeUnit(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.SettlerUnit} which refers to the Civilization 
	     * object which calls this  method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.SettlerUnit} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public SettlerUnit getSettlerUnit(String settlementName) {
	        return new SettlerUnit(this, settlementName);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.AnglerUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.AnglerUnit} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public AnglerUnit getAnglerUnit() {
	        return new AnglerUnit(this);
	    }

	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.CoalMinerUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.CoalMinerUnit} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public CoalMinerUnit getCoalMinerUnit() {
	        return new CoalMinerUnit(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.FarmerUnit} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.FarmerUnit} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public FarmerUnit getFarmerUnit() {
	        return new FarmerUnit(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.MasterBuilderUnit} which refers to the 
	     * Civilization  object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.MasterBuilderUnit} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public MasterBuilderUnit getMasterBuilderUnit() {
	        return new MasterBuilderUnit(this);
	    }

	    
	    /**
	     * This method returns an object type of {@linkplain model.Settlement} with the name given as parameter
	     * by calling the constructor {@linkplain model.Settlement#Settlement(Civilization, String)}.
	     *
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.Settlement} which is an attribute of the Civilization object
	     * which calls this method.
	     */
	    public Settlement getSettlement(String settlementName) {
	        return new Settlement(this, settlementName);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.FishingShack} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.FishingShack} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public FishingShack getFishingShack() {
	        return new FishingShack(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.CoalMine} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.CoalMine} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public CoalMine getCoalMine() {
	        return new CoalMine(this);
	    }

	    
	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.Farm} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.FishingShack} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public Farm getFarm() {
	        return new Farm(this);
	    }

	    /**
	     * 
	     * This method returns a new object type of {@linkplain model.Landmark} which refers to the Civilization 
	     * object which calls this method.
	     * 
	     * @author valentinos Pariza
	     * @since 1/4/2018
	     * @return an object type of {@linkplain model.Landmark} which refers to the Civilization object which 
	     * calls this method
	     * 
	     */
	    public Landmark getLandmark() {
	        return new Landmark(this);
	    }
	    
	    
}
