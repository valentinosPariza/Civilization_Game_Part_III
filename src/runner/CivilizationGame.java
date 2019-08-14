package runner;

import view.UI;


/**
 * This class is responsible for starting the game named as the class "CivilizationGame".it has only one method the 
 * main method.
 * 
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
public class CivilizationGame {
	
	
	/**
	 * This method calls the method {@linkplain UI#start()}.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param args  the general array of String which is used for receiving values from command line
     */
    public static void main(String[] args) throws Exception {
        UI.start();
        
    }
}
