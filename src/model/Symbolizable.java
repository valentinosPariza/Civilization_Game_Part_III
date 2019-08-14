package model;
/**
 * This interface represents the Symbols which every MapObject(object on the map) should be represented with.All 
 * classes which implement this interface should define the method{@linkplain model.Symbolizable#symbol()}.
 * 
 *
 * @author valentinos Pariza
 * @since 1/4/2018
 *
 */
interface Symbolizable {
	
	/**
	 * This method should be defined in a way which returns a character which is unique for each MapObject.
	 * 
	 * @author valentinos Pariza
	 * @since 1/4/2018
	 * @return a character which represents the MapObject which calls this method on the map
	 */
	public char symbol();

}
