package model;

/**
 * This class inherits from {@linkplain model.MapObject}.This class is an abstract class,which means that no object  
 * type of {@linkplain model.Building} can be made directly.Although this class is used for creating special objects
 * type of classes which are descendant of this class. This object represents the general characteristics and 
 * operations of a building.Moreover every building can have a variety of advantages.Such advantages are for example 
 * producing resources,or increasing the happiness of a civilization and more other...   
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
abstract class Building extends MapObject {
    private int goldGeneration;									// These attributes represent the amount of points
    private int resourceGeneration;								// of sections which periodically can give to a 
    private int foodGeneration;									// a civilization.Increase periodically the amount
    private int techPointGeneration;							// of the points of the section which the attribute
    private int philosophyGeneration;							// indicates.
    private int happinessGeneration;

    /**
     * A constructor for creating an object of this class with the specific attributes ,to be initialized with the 
     * values given by the parameters.Also uses the constructor of the superclass {@linkplain model.MapObject} to
     * create and initialize the object type of {@linkplain model.MapObject} which is "inside" of the current object 
     * being created.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param health the health of the Building
     * @param owner the Civilization on which the object being created refers to 
     * @param goldGeneration the initial amount of gold which every time will be produced
     * @param resourceGeneration the initial amount of the resources which every time will be produced
     * @param foodGeneration  the initial amount of food which every time will be produced
     * @param techPointGeneration  the initial amount of the Technology points which every time will be added
     * @param philosophyGeneration the initial amount of the Philosophy points which every time will be added
     * @param happinessGeneration the initial amount of the happiness points which every time will be added
     * 
     * 
     */
    public Building(int health, Civilization owner, int goldGeneration,
        int resourceGeneration, int foodGeneration, int techPointGeneration,
        int philosophyGeneration, int happinessGeneration) {
        super(health, owner);
        this.goldGeneration = goldGeneration;
        this.resourceGeneration = resourceGeneration;
        this.foodGeneration = foodGeneration;
        this.techPointGeneration = techPointGeneration;
        this.philosophyGeneration = philosophyGeneration;
        this.happinessGeneration = happinessGeneration;
    }

    /**
     * 
     * This method is abstract and is going to be defined in the lower classes (in the subclasses of this class).
     * Although this class should represent the investment of upgrading a building.Which means should do some upgrades 
     * on the objects type of {@linkplain model.Building}(of descendant classes) which call this method. 
     * 
     *  
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public abstract void invest();

    /**
     * This class as indicated by its name is used to demolish a building(an object type of {@linkplain model.Building}
     * (of descendant classes) ).By demolishing a building some resources are given back.This method uses the method
     * {@linkplain model.Civilization#produceResources(int)} to increase the resources of  the civilization
     * which owns this building and also use the method {@linkplain Math#max(int, int)} for getting the maximum number 
     * between two number ,5 and the number of the resource generation which the building which was demolished had.   
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public void demolish() {
        getOwner().produceResources(Math.max(resourceGeneration, 5) * 5);
    }

    
    /**
     * This method is defined in this class,but is given from {@linkplain model.MapObject} and increases all the points 
     * of all Sections of the Civilization as indicated by the attributes of the Building object which calls this 
     * method. 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public void tick() {
        getOwner().getTreasury().earn(goldGeneration);
        getOwner().produceResources(resourceGeneration);
        getOwner().makeFood(foodGeneration);
        getOwner().getTechnology().increaseUnderstanding(philosophyGeneration);
        getOwner().getTechnology().increaseBuildExperience(techPointGeneration);
        getOwner().increaseHappiness(happinessGeneration);
    }

    
    /**
     * This method returns the amount of gold which every time is produced by this Building object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of gold which is produced periodically
     * 
     */
    public int getGoldGeneration() {
        return goldGeneration;
    }

    
    /**
     * This method sets a new amount of the attribute about periodically production of gold
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of gold which is going to be produced periodically
     */
    public void setGoldGeneration(int generation) {
        this.goldGeneration = generation;
    }

    
    /**
     * This method returns the amount of resources which every time is produced by this Building object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of resources which is produced periodically
     * 
     */
    public int getResourceGeneration() {
        return resourceGeneration;

    }

    
    /**
     * This method sets a new amount of the attribute about periodically production of resources
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of resources which is going to be produced periodically
     */
    public void setResourceGeneration(int generation) {
        this.resourceGeneration = generation;

    }

    
    /**
     * This method returns the amount of food which every time is produced by this Building object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of food which is produced periodically
     * 
     */
    public int getFoodGeneration() {
        return foodGeneration;

    }

   
    
    
    /**
     * This method sets a new amount of the attribute about periodically production of food
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of food which is going to be produced periodically
     */
    public void setFoodGeneration(int generation) {
        this.foodGeneration = generation;

    }

    
    /**
     * This method returns the amount of technology points which every time is produced by this Building object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of technology points which is produced periodically
     * 
     */
    public int getTechPointGeneration() {
        return techPointGeneration;

    }

    
    /**
     * This method sets a new amount of the attribute about periodically production of technology points
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of technology points which is going to be produced periodically
     */
    public void setTechPointGeneration(int generation) {
        this.techPointGeneration = generation;

    }

    
    /**
     * This method returns the amount of philosophy(understanding) points which every time is produced by this Building 
     * object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of philosophy(understanding) points which is produced periodically
     * 
     */
    public int getPhilosophyGeneration() {
        return philosophyGeneration;

    }

    
    
    /**
     * This method sets a new amount of the attribute about periodically increasement of philosophy-understanding points
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of philosophy-understanding points which is going to be increased periodically
     */
    public void setPhilosophyGeneration(int generation) {
        this.philosophyGeneration = generation;

    }

    
    /**
     * This method returns the amount of happiness points which every time is produced by this Building object
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the amount of happiness points which is produced periodically
     * 
     */
    public int getHappinessGeneration() {
        return happinessGeneration;

    }

    
    /**
     * This method sets a new amount of the attribute about periodically increasement of happiness points
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param the new amount of happiness points which is going to be increased periodically
     */
    public void setHappinessGeneration(int generation) {
        this.happinessGeneration = generation;
    }


    /**
     * This method creates a String representation of the object which calls this method and  also contains the String 
     * representation of the object type of {@linkplain model.MapObject} which is inside this object type of 
     * {@linkplain model.Building},by calling the corresponding {@linkplain model.MapObject#toString()} of the 
     * superclass.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String representation of the object which calls this method
     */
    @Override
    public String toString() {
        return "Building. " + super.toString();
    }

}
