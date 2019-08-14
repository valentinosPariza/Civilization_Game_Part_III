package model;
/**
 * This enumerated Type represents the different Terrains which can be appeared on a map and generally
 * in the world. This Type is going to be used in order to examine what we can do in different Terrains in the game
 * such as build a FishingShack on water, a LandMark on Plain etc .Every enumerated Type type of TileType
 * has three attributes the special character it represents({@linkplain model.TileType#symbol}), its Name(
 * {@linkplain model.TileType#name}) and the cost of Endurance for a Unit to move on it 
 * ({@linkplain model.TileType#cost}).
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 *
 */
enum TileType {

										// These are the different enumerated Types which are used in this game
    PLAINS('P', "Plains", 1),
    MOUNTAIN('M', "Mountain", 5),
    HILLS('H', "Hills", 3),
    ICE('I', "Ice", 3),
    WATER('W', "Water", 5),
    FOREST('F', "Forest", 2);
	
	
    private char symbol;
    private String name;
    private int cost;
    
    
/**
 * A constructor for building the enumerated Type objects,type of TileObject, by giving three parameters,its special 
 * character,its name and the cost for building on it.
 * 
 * @author valentinos Pariza
 * @since 1/4/2018
 * @param symbol the special symbol of the TileType enum Object
 * @param name the name of the TileType enum Object
 * @param cost and the cost of endurance for a Unit
 */
    private TileType(char symbol, String name, int cost) {
        this.symbol = symbol;
        this.name = name;
        this.cost = cost;
    }

    
    /**
     * This method returns the special character which the TileType object calls this method
     * 
    * @author valentinos Pariza
    * @since 1/4/2018
    * @return the special character which the TileType object calls this method
    */
    public char getSymbol() {
        return this.symbol;
        
    }
    
    
    /**
     * This method returns the name which the TileType object calls this method
     * 
    * @author valentinos Pariza
    * @since 1/4/2018
    * @return the name which the TileType object calls this method
    */
    public String getName() {
        return this.name;
    }

    
    
    /**
     * This method returns the cost which needs for Endurance which a unit needs to move on it
     * 
    * @author valentinos Pariza
    * @since 1/4/2018
    * @return the cost which needs for building on the TileType object which calls this method
    */
    public int getCost() {
        return this.cost;
    }
}
