package model;

/**
 * This abstract class is a class which represents objects on the map,military,buildings and settlements. This class
 * implements interface {@linkplain model.Symbolizable} which indicates that any object of this class or of a descendant
 * class of this class has a unique symbol with which the object is appeared on the map.All MapObjects has some general 
 * characteristics like health and the owner Civilization(object type of {@linkplain model.Civilization}) and also 
 * some common operations.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
abstract class MapObject implements Symbolizable{
	
    private int health;									// the health of a MapoObject
    
    private Civilization owner;							// the Owner Civilization of this MapObject

    
    /**
     * A constructor which creates an object of this class with health and Civilization owner as indicated by the 
     * parameters 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param health the health of the mapObject
     * @param owner the Civilization object which is going to be used as the base,on which the MapObject is going to 
     * be created
     */
    public MapObject(int health, Civilization owner) {
        this.health = health;
        this.owner = owner;
    }

    
    /**
     * A getter method which returns an object type of {@linkplain model.Civilization } or a descendant class of this
     * class, which is the owner of this MapObject
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the owner of this MapObject which is an object type of {@linkplain model.Civilization } or a descendant 
     * class of this class
     * 
     */
    public Civilization getOwner() {
        return owner;
    }

    
    /**
     * This method represents the damage which is caused on the MapObject which calls this method.It reduces the health
     * of this MapObject by the amount which is indicated by the parameter.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param healthAmount an integer number indicating the amount of health points which are going be removed from 
     * 		  the health of the current MapObject
     */
    public void damage(int healthAmount) {
        this.health -= healthAmount;
    }

    /**
     * This method checks whether the object type of {@linkplain model.MapObject} is destroyed.It checks if the health
     * of this object is equal or less than 0.If this is true then it sends true otherwise false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a boolean value representins if the health of this MapObject is equal or less than 0.
     */
    public boolean isDestroyed() {
        return this.health <= 0;
    }

    /**
     * This method's signature is being written here but the definition of this method is given in lower level,which 
     * means in some classes which inherit from this(which are subclasses from this) we can see the full definition
     * of this method. In some words this method should represent a periodic function of a specific object, type of a 
     * descendant class of {@linkplain model.MapObject} like production of resources,or consuming of resources.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    public abstract void tick();

    
    /**
     * This method which is overridden (Inherited from the basic class {@linkplain Object}) ,returns a String 
     * representation of the object(type of {@linkplain model.MapObject}) calling this method.This String presents
     * the health and the name of the owner of the object which calls the method.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String representation of the object calling this method
     */
    @Override
    public String toString() {
        return "Health: " + health + ", Owner: " + owner.getName() + ".";
    }

}
