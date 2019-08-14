package model;
/**
 * This class represents the terrain tile on a map(object type of  {@linkplain model.Map} and all the operations that
 * can be made on it.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class TerrainTile implements Symbolizable {
	
    private MapObject occupant;				//  Every terrain Tile has a MapObject on it
    private TileType type;					//  Every terrain Tile is a type of terrain TileType

    
    /**
     * A constructor of objects type of this class which takes two parameters, an object type of 
     * {@linkplain model.MapObject} indicating what kind of object is positioned inside this object and an object type 
     * of {@linkplain model.TyleType} indicating the terrain type of the object created.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param type object type of {@linkplain model.TyleType} which is assigned to the attribute of the object created
     * @param occupant object type of {@linkplain model.MapObject} which is assigned to the attribute of the object 
     * created
     */
    public TerrainTile(TileType type, MapObject occupant) {
        this.type = type;
        this.occupant = occupant;
    }

    /**
     * A constructor of objects type of this class which takes one parameter, an object type 
     * of {@linkplain model.TyleType} indicating the terrain type of the object created.The other attribute 
     * which indicates the object type of {@linkplain model.MapObject} is set as null.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param type object type of {@linkplain model.TyleType} which is assigned to the attribute of the object created
     * 
     */
    public TerrainTile(TileType type) {
        this(type, null);
    }

    
    /**
     * This method returns the type of terrain{@linkplain model.TyleType} which the object invoking this method is.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the attribute about what kind of terrain is the object calling this method type of
     * 			 {@linkplain model.TyleType}
     */    
    public TileType getType() {
        return type;
    }

    
    /**
     * This method takes an object type of {@linkplain model.MapObject} in order to update the attribute (which refers
	 * to the type of  object which is inside) of the object invoking the method.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param occupant an object type of  {@linkplain model.MapObject} in order to update the attribute of 
     */
    public void setOccupant(MapObject occupant) {
        this.occupant = occupant;
    }

    
    /**
     * This method returns the object type of {@linkplain model.MapObject} which is inside of the object calling the 
     * method.if there isn't any object ,it is returned null.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the attribute(attribute which refers to the object type of {@linkplain model.MapObject} which is inside
     * ) of the object which invoking this method   
     */
    public MapObject getOccupant() {
        return occupant;
    }

    
    /**
     * Returns whether the attribute about occupant is null or not
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the attribute which has the occupant of this object which calls the method ,is null ,otherwise 
     * false
     */
    public boolean isEmpty() {
        return occupant == null;
    }

    /**
     * Returns the character which symbolizes the type of terrain tile which the object invoking the method has.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character representing the terrain tile type(object type of {@linkplain moddel.TileType}) 
     */
    @Override
    public char symbol() {
        return type.getSymbol();
    }

    
    /**
     * 
     * This method creates a String by using also the method  which represents this object and 
     * returns it.Moreover the String contains the name of the tile type Terrain and the cost on building
     *  on it.(Uses the methods  {@linkplain model.TileType#getCost()} and  {@linkplain model.TileType#getName()})
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return String representation of the object type of this class
     */
    @Override
    public String toString() {
        return type.getName() + " tile that has an endurance cost of "
            + type.getCost();
    }
}
