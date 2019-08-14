package model;




/**
 * This class inherits from class Unit and also implements interface Convertable.This class represents the special
 * Unit Settler which can settle to a place and build a new Settlement.Every object type of SettlerUnit has inside it
 * an attribute which represents the String name of the name,of the town- Settlement which will create.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
 class SettlerUnit extends Unit implements Convertable{

	private String townName;								//  the name of the Settlement -Town
	
	
	 /**
	  * A constructor for an object of this class which invokes the constructor 
	  * {@linkplain model.Unit#Unit(Civilization)} of the ancestor class.This object is created on the object type of
	  *  {@linkplain model.Civilization}which is given as a parameter.Also set the name of the Settlement which 
	  *  can be built by this Unit,as indicated by the parameter which was given.  
	  * 
	  * @author valentinos Pariza
	  * @since 2/4/2018
	  * @param  owner object type of {@linkplain model.Civilization} which owns the Unit which is being created.
	  * @param name String which is the name of the Settlement which can be built by this Unit
	  * 
	  */
	public SettlerUnit(Civilization owner,String name)
	{
		super(owner);
		this.townName=name;
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
		
		return 's';
	}

	
	/**
	 * 
	 * Returns type of Building which refers to the corresponding type of Building which the Civilization
     * can build with this Unit( Settlement Building).This method also increments by one the number of the settlements
     *  which are present built.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of Building which refers to the corresponding type of Building which the Civilization
     * can build with this Unit( Settlement Building) 
     */
	@Override
	public Building convert() {
		this.getOwner().incrementNumSettlements();
		
		return getOwner().getSettlement(this.townName);
	}

	
	
	/**
	 * This method examines if the  {@linkplain model.TileType} object which is given as a parameter can be used to 
	 * build on it the Building which this unit can build.This unit can only build its Building on 
	 * {@linkplain model.TileType#PLAINS}
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param type an object type of {@linkplain model.TileType} which represents the terrains
     * @return true if the Building type which this Unit can build, can be built on the terrain,type of
     *  {@linkplain model.TileType} which is given as parameter,otherwise return false
     *  
     */
	@Override
	public boolean canConvert(TileType type) {
	
		if(type==TileType.PLAINS)
			return true;
		else return false;
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
		return "Settlers of "+this.townName+". "+super.toString();
	}
	
	
}
