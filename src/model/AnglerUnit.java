package model;


/**
 * This class inherits from class Unit and also implements interface Convertable.This class represents the special
 * Unit Anglers-AnglerUnit.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
 class AnglerUnit extends Unit implements Convertable{

	 
	 
	 /**
	  * A constructor for an object of this class which invokes the constructor 
	  * {@linkplain model.Unit#Unit(Civilization)} of the ancestor class.This object is created on the object type of
	  *  {@linkplain model.Civilization}which is given as a parameter
	  * 
	  * @author valentinos Pariza
	  * @since 2/4/2018
	  * @param owner object type of {@linkplain model.Civilization} which owns the Unit which is being created.
	  * 
	  */
	public AnglerUnit(Civilization owner) {
		super(owner);
		
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
		
		return 'a';
	}

	
	/**
	 * 
	 * Returns type of Building which refers to the corresponding type of Building which the Civilization
     * can build with this Unit( FishingShack Building) 
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of Building which refers to the corresponding type of Building which the Civilization
     * can build with this Unit( FishingShack Building) 
     */
	@Override
	public Building convert() {
		
		return getOwner().getFishingShack();
	}

	
	
	/**
	 * This method examines if the  {@linkplain model.TileType} object which is given as a parameter can be used to 
	 * build on it the Building which this unit can build.This unit can only build its Building on 
	 * {@linkplain model.TileType#WATER}
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
		
		if(type==TileType.WATER)
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
	public String toStrig() {
		return "Anglers. "+super.toString();
	}
	

}
