package model;
/**
 * This class has only the main method.This class is used to represent the map on the screen(to print the map and all 
 * its objects on it).
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class View {
	
	
	/**
	 * This method is the main method of this class.It is used to create a map 10x10 object type  {@linkplain model.Map}
	 *  and print it on the screen with symbols. 
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param args the general array of String which is used for receiving values from command line
     */
	public static void main(String[] args) {
		
		Map map = new Map(10, 10);
		System.out.println(map);
	}
}
