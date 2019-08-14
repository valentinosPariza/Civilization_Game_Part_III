package controller;
import model.Model;
import view.UI;


/**
 * This class is responsible for controlling some basic functions of the game and for doing some basic operations
 * using other classes and methods of this program.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
public class GameController {

	
	/**
	 * This method takes an integer number and invokes method  {@linkplain model.Model#chooseCivilization(int)} and
	 * also return the result which the invoke of the method mentioned return.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param civChoice an integer number representing the choice of a Civilization
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#chooseCivilization(int)}
     * returns
     */
    public static boolean chooseCivilization(int civChoice) {
        return Model.chooseCivilization(civChoice);
    }

    
    /**
	 * This method invokes method  {@linkplain model.Model#addFirstSettlement(String)} in the beginning of the game
	 * 
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param name a String which represents the name of the first Settlement
     */
    public static void addFirstSettlement(String name) {
        Model.addFirstSettlement(name);
    }

    
    /**
	 * This method invokes method  {@linkplain model.Model#gameScreen()} and returns the String which thsi method 
	 * returns
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which the method {@linkplain model.Model#gameScreen()} returns
     */
    public static String gameScreen() {
        return Model.gameScreen();
    }
    
    /**
	 * This method invokes method  {@linkplain model.Model#getPlaying()} and also return the result which the invoke
	 *  of the method mentioned return.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#getPlaying()} 
     * returns
     */
    public static boolean playing() {
        return Model.getPlaying();
    }

    
    /**
	 * This method invokes method  {@linkplain model.Model#setPlaying(boolean)()} for ending the game
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     */
    public static void end() {
        Model.setPlaying(false);
    }

    
    
    /**
     * This method takes an integer number for an option and invokes the appropriate method,for 1: 
     *  {@linkplain UI#manage()} ,managing its Objects(Building,Units etc),for 2:{@linkplain UI#explore()} exploring
     *  the nature ,for 3: {@linkplain controller.GameController#end()} ,quite the game...
     *  .For any other number it does not do nothing
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param turnOption an integer number representing the option of the player.
     */
    public static void turnOption(int turnOption) {
        switch (turnOption) {
        case 1:
            UI.manage();
            break;
        case 2:
            UI.explore();
            break;
        case 3:
            end();
            break;
        default:
            break;
        }
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#selectTile(int, int)} for selecting the object type of
   	 * {@linkplain model.TerrainTile} 
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param r the row on which the object on the map(two dimensional array is placed)
     * @param c the column on which the object on the map(two dimensional array is placed)
     */
    public static void selectTile(int r, int c) {
        Model.selectTile(r, c);
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#selectedOptions()} and returns the String which this method 
   	 * returns
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which the method {@linkplain model.Model#selectedOptions()} returns
     */
    public static String selectedOptions() {
        return Model.selectedOptions();
    }

    
    
    /**
   	 * This method invokes method  {@linkplain model.Model#selectedString()} and returns the String which this method 
   	 * returns
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which the method {@linkplain model.Model#selectedString()} returns
     */
    public static String selectedString() {
        return Model.selectedString();
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#selectedMapObjectString()} and returns the String which 
   	 * this method returns
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which the method {@linkplain model.Model#selectedMapObjectString()}  returns
     */
    public static String selectedMapObjectString() {
        return Model.selectedMapObjectString();
    }

    
    
    
    /**
	 * This method takes invokes method {@linkplain model.Model#moveSelected(int, int)} and also return the result 
	 * which the invoke of the method mentioned return.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param r the row on which the object on the map(two dimensional array is placed)
     * @param c the column on which the object on the map(two dimensional array is placed)
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#moveSelected(int, int)}
     * returns
     */
    public static boolean moveSelected(int r, int c) {
        return Model.moveSelected(r, c);
    }

    
    /**
	 * This method takes invokes method {@linkplain model.Model#recruitSelected(int, String)} and also return the 
	 * result which the invoke of the method mentioned return.
	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param selection an integer number which shows what Unit was selected
     * @param name String name of a possible new Settlement given to a SettlerUnit in order to build and name it
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#recruitSelected(int, String)}
     * returns
     */
    public static boolean recruitSelected(int selection, String name) {
        return Model.recruitSelected(selection, name);
    }

    
    
    /**
   	 * This method invokes method  {@linkplain model.Model#explore()} and returns the String which 
   	 * this method returns
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which the method {@linkplain model.Model#explore()}  returns
     */
    public static String explore() {
        return Model.explore();
    }

    
    
    /**
   	 * This method takes invokes method {@linkplain model.Model#attackSelected(int, int)} and also return the result 
   	 * which the invoke of the method mentioned return.
   	 * 
        * @author valentinos Pariza
        * @since 2/4/2018
        * @param r the row on which the object on the map(two dimensional array is placed)
        * @param c the column on which the object on the map(two dimensional array is placed)
        * @return	true or false,the boolean value that the method  {@linkplain model.Model#attackSelected(int, int)}
        * returns
        */
    public static boolean attackSelected(int r, int c) {
        return Model.attackSelected(r, c);
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#convertSelected()}  and also return the result which the 
   	 * invoke of the method mentioned return.
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#convertSelected()} 
     * returns
     */
    public static boolean convertSelected() {
        return Model.convertSelected();
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#tick()}  of the class  {@linkplain model.Model}
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     */
    public static void tick() {
        Model.tick();
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#checkWin()} for checking for a win  and also return the 
   	 * result which the invoke of the method mentioned return.
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return	true or false,the boolean value that the method  {@linkplain model.Model#checkWin()} 
     * returns
     */
    public static boolean checkWin() {
        return Model.checkWin();
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#investSelected()}  and also return the result which the 
   	 * invoke of the method mentioned return.
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return	true or false,the boolean value that the method {@linkplain model.Model#investSelected()}
     * returns
     */
    public static boolean investSelected() {
        return Model.investSelected();
    }

    
    /**
   	 * This method invokes method  {@linkplain model.Model#demolishSelected()} and also return the result which the 
   	 * invoke of the method mentioned return.
   	 * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return	true or false,the boolean value that the method {@linkplain model.Model#demolishSelected()}
     * returns
     */
    public static boolean demolishSelected() {
        return Model.demolishSelected();
    }

}
