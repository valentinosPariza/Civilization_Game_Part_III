package model;
/**
 * This interface represents the function of converting a building by the help of a Builder ,into a building in the map.
 * More simple building a Building with a builder(Classes which represent builders)  and make it appear in the map.
 * Every class which implements this interface must define the methods:
 * {@linkplain model.Convertable#canConvert(TileType)}  and {@linkplain model.Convertable#convert()} 
 *
 * @author valentinos Pariza
 * @since 1/4/2018
 *
 */
interface Convertable {
	
	/**
	 * This method should be used for returning an object type of Building or a descendant class of Building
	 * which that Civilization(which wants to build the Building) can build 
	 * 
	 * @author valentinos Pariza
	 * @since 1/4/2018
	 * @return an object type of Building
	 */
    Building convert();
    
    /**
     * This method should check if a Building convention can be made.If the place which on is going to be built is 
     * appropriate for this Building and return if it is appropriate or not.The place is defined by enumerated class
     * {@linkplain model.TileType}
     * 
     * @author valentinos Pariza
	 * @since 1/4/2018
     * @param type
     * @return
     */
    boolean canConvert(TileType type);
}
