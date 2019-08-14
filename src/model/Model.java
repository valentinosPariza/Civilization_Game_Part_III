package model;


/**
 * This class represents the moves of the player upon the map and the translation of the moves into operations which 
 * are made in background. 
 * 
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 *
 *  
 */
public class Model {

    private static Civilization playerCivilization;		// the object type of Civilization which the player supports
    
    private static Map map;								// the map on which the game is currently played
    
    private static boolean playing;  					//  if still player is playing
    
    private static TerrainTile selected;				// The object on the map which currently is selected
    
    private static int selectedRow;						//  the selected row and column on the map
    private static int selectedCol;

    // initialization block which initializes all static attributes of the class when it is loaded
    static {
        map = new Map(10, 10);				//  creates the map
        playing = true;						//  indicate that the player is still playing
    }

    /**
     * A constructor with no parameters which creates an object type of this class.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    private Model() {
    }

    
    /**
     * This method returns the status if the player is still playing(true if is still playing,false otherwise)
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the status if the player is still playing
     */
    public static boolean getPlaying() {
        return playing;
    }

    
    /**
     * Sets the status of playing of the player to false.Indicating that the player stops playing the Game.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param playing a boolean parameter
     */
    public static void setPlaying(boolean playing) {   //??
        Model.playing = false;
    }
    
    
    /**
     * This method takes an integer number which represents the choice of the player,about which civilization type to
     * choose.It returns if the player has selected a Civilization.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param civChoice an integer number representing the choice of a civilization(1:Egypt,2:QinDynasty,3:RomanEmpire)
     * @return true if the player's choice is between 1-3 false otherwise
     */
    public static boolean chooseCivilization(int civChoice) {
        switch (civChoice) {
        case 1:
            playerCivilization = new Egypt();
            return true;
        case 2:
            playerCivilization = new QinDynasty();
            return true;
        case 3:
            playerCivilization = new RomanEmpire();
            return true;
        default:
            return false;
        }
    }
    

    /**
     * This method invokes the method {@linkplain model.Civilization#explore()} and returns the String result which 
     * the method returns by the invoking.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return the String which the method {@linkplain model.Civilization#explore()} returns
     */
    public static String explore() {
        return playerCivilization.explore();
    }
    
    
    /**
     * This method creates the first settlements at the beginning of the game.It takes the name of the Civilization and 
     * the Civilization which the settlement belongs to and also the row and column which its position is located on
     * the map(object type of {@linkplain model.Map}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param name String name of the new Settlement
     * @param civ the Civilization which owns the new Settlement which is created
     * @param r the row of the array in the map which the settlement is built
     * @param c the column of the array in the map which the settlement is built
     */
    public static void putSettlement(String name, Civilization civ,
        int r, int c) {
        map.getTile(r, c).setOccupant(civ.getSettlement(name));    
        playerCivilization.incrementNumSettlements();
    }

    
    /**
     * This methods place three objects type of {@linkplain model.MeleeUnit} in the map and also one settlement.All
     * these objects which this method places on the map are supposed to be enemies. 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param civ the Civilization which owns the objects which are going to be created on the map
     */
    public static void addEnemies(Civilization civ) {
        map.getTile(4, 7).setOccupant(civ.getMeleeUnit());
        map.getTile(5, 7).setOccupant(civ.getMeleeUnit());
        map.getTile(4, 6).setOccupant(civ.getMeleeUnit());
        map.getTile(5, 8).setOccupant(civ.getSettlement("Bandit Hideout"));
    }

    
    
    public static boolean adjacentTo(int r, int c, String what) {
        if (c % 2 == 0) {
            if (r < map.getRows() - 1
                && adjBool(r + 1, c, what)) {
                return true;
            } else {
                for (int r2 = r - 1; r2 < r + 1 && r2 > -1
                    && r2 < map.getRows();
                    r2++) {
                    for (int c2 = (c == 0 ? 0 : c - 1); c2 < c + 2
                        && c2 < map.getColumns(); c2++) {
                        if (adjBool(r2, c2, what)) {
                            return true;
                        }
                    }
                }
            }
        } else {
            if (r > 0 && adjBool(r - 1, c, what)) {
                return true;
            } else {
                for (int r2 = r; r2 < r + 2 && r2 < map.getRows();
                    r2++) {
                    for (int c2 = (c == 0 ? 0 : c - 1); c2 < c + 2
                        && c2 < map.getColumns(); c2++) {
                        if (adjBool(r2, c2, what)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    
    /**
     * This method takes a String and the row and column of an object in the two-dimensional array in map object
     * and examines if the String is equal to "SETTLEMENT" then if the object type of {@linkplain model.MapObject}
     *  in the specific position indicated by the row,column parameters is type of  {@linkplain model.Settlement}
     *  returns true (else false,if it is not type of it).Else if the String is equal to "SELECTED" then it returns 
     *  if the object is the same object as the object which is currently selected(have the same address in memory).
     *  Else it returns false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a boolean value as explained
     */
    private static boolean adjBool(int r, int c, String what) {
        switch (what) {
        case "SETTLEMENT":
            return map.getTile(r, c).getOccupant() instanceof Settlement;
        case "SELECTED":
            return map.getTile(r, c) == selected;
        default:
            return false;
        }
    }

    
    /**
     * 
     * This method adds the first settlement of the player and also the enemies of the player on the map.
     * This method uses methods  {@linkplain model.Model#putSettlement(String, Civilization, int, int)}
     * and  {@linkplain model.Model#addEnemies(Civilization)}
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param name a String representing the name of the Settlement which will be added.
     */
    public static void addFirstSettlement(String name) {
        putSettlement(name, playerCivilization, 5 , 5);
        addEnemies(new Civilization("Bandits"));
    }

    
    
    /**
     * This method creates a String which represents the map and all the information of the Player's civilization
     * ,like the materials,the Strategy Points,the current number of settlements etc and returns it.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which represents the map and all the information of the Player's civilization
     */
    public static String gameScreen() {
        Civilization civ = playerCivilization;
        String gameScreen = map.toString()
            + "Materials:\n"
            + "Gold: " + civ.getTreasury().getCoins() + "\t"
            + "Food: " + civ.getFood() + "\t"
            + "Resources: " + civ.getResources() + "\t"
            + "Happiness: " + civ.getHappiness() + "\n"
            + "Stats:\n"
            + "Philosophy Points: " + civ.getTechnology().getUnderstanding()
            + "\t"
            + "Technology Points: " + civ.getTechnology().getBuildExperience()
            + "\t"
            + "Strategy Points: " + civ.getStrategy().getStrategyLevel()
            + "\t"
            + "Settlements Remaining: " + civ.getNumSettlements() + "\n";
        return gameScreen;
    }

    
    /**
     * This method selects a new object which stores it (in order to remember it as the currently selected object in 
     * the map) in a variable.The position of the new selected object is indicated by the rows and columns,two 
     * parameters which are given
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param r the row in the array in object map type of  {@linkplain model.Map}
     * @param c the column in the array in object map type of  {@linkplain model.Map}
     */
    public static void selectTile(int r, int c) {
        selected = map.getTile(r, c);
        selectedRow = r;
        selectedCol = c;
    }

    
    
    /**
     * This method creates a String about the information of the object which is currently selected and returns it.
     * For example if it is an enemy object or the Player's settlement,or the Player's MilitaryUnit etc.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which represents the object which is currently selected
     */  
    public static String selectedOptions() {
        MapObject occupant = selected.getOccupant();
        
        if (occupant != null) {
            if (occupant.getOwner() != playerCivilization) {
                return "That tile contains the enemy " + occupant.toString();
            } else if (occupant instanceof Building) {
                return "BUILDING";
            } else if (occupant instanceof MilitaryUnit) {
                return "MILITARY_UNIT";
            } else {
                return "WORKER_UNIT";
            }
        } else if (adjacentTo(selectedRow, selectedCol, "SETTLEMENT")) {
            return "RECRUIT_SPACE";
        } else {
            return "That tile is empty, and is a " + selected.toString();
        }
    }

    /**
     * This method invokes the method  {@linkplain model.TerrainTile#toString()} and returns the String result.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which represents the  {@linkplain model.TerrainTile} object which is currently selected
     */
    public static String selectedString() {
        return selected.toString();
    }

    /**
     * This method returns a String which represents the selected object type of  {@linkplain model.TerrainTile}.
     * If no object is selected it returns "null"
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String which represents the selected object type of  {@linkplain model.TerrainTile}.If no object 
     * 		  is selected it returns "null".
     */
    public static String selectedMapObjectString() {
        return selected != null
            ? selected.getOccupant().toString()
            : "null";
    }

    
    /**
     * This method examines if the selected unit(object type of  {@linkplain model.MapObject} ) can be moved 
     * to other position in the map.If it can it moves(hae) it,reduce its endurance  and returns true.Otherwise if it 
     * can't be moved it returns false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the object type of Unit has moved to the position indicated or false if not
     */
    public static boolean moveSelected(int r, int c) {
    	
        if (adjacentTo(r, c, "SELECTED")
            && ((Unit) selected.getOccupant()).canMove(selected.getType().getCost()) && map.isEmpty(r, c)) 
        {
            map.getTile(r, c).setOccupant(selected.getOccupant());
            
            ((Unit) selected.getOccupant()).deductEndurance(map.getTile(r, c).getType().getCost());
            
            selected.setOccupant(null);
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * This method takes the choice of the player about  which Unit to train and if the unit is valid and if the unit 
     * is affordable by the Civilization which will own the unit,it trains the unit apply initial costs to the 
     * Civilization and also deploy Unit to map and returns true,otherwise returns false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if a Unit is created by the choice of Player,false otherwise
     */
    public static boolean recruitSelected(int selection, String name) {
        Unit newUnit = null;
        switch (selection) {
        case 1:
            newUnit = playerCivilization.getMeleeUnit();
            break;
        case 2:
            newUnit = playerCivilization.getRangedUnit();
            break;
        case 3:
            newUnit = playerCivilization.getHybridUnit();
            break;
        case 4:
            newUnit = playerCivilization.getSiegeUnit();
            break;
        case 5:
            newUnit = playerCivilization.getSettlerUnit(name);
            break;
        case 6:
            newUnit = playerCivilization.getFarmerUnit();
            break;
        case 7:
            newUnit = playerCivilization.getCoalMinerUnit();
            break;
        case 8:
            newUnit = playerCivilization.getAnglerUnit();
            break;
        case 9:
            newUnit = playerCivilization.getMasterBuilderUnit();
            break;
        default:
            break;
        }
        if (newUnit != null && newUnit.isAffordable()) {
            newUnit.applyInitialCosts();
            selected.setOccupant(newUnit);
            return true;
        }
        return false;
    }
    
    
    
    /**
     * This method takes the row and the column of a position in the array in an object type of  {@linkplain model.Map}
     * and examines if that object in the positioned which is indicated can be attacked by the object which is 
     * selected and returns the result of the examination.Also if the attackcan be done it makes the attack on the 
     * object by calling method {@linkplain model.MilitaryUnit#attack(MapObject)}.Moreover  sets the occupant of 
     * the selected object or the object which is indicated by the parameters to null if it is destroyed(Invoke method
     * {@linkplain model.MapObject#isDestroyed()} for accomplishing this task).
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param r  the row of the two-dimensional array in an object type of {@linkplain model.Map} which this class
     * 		has as a static variable
     * @param c the column of the two-dimensional array in an object type of {@linkplain model.Map} which this class
     * 		has as a static variable
     * @return true if the attack was made successfully,otherwise false
     * 
     */
    public static boolean attackSelected(int r, int c) {
    	
        TerrainTile terrain=map.getTile(r, c);
        
        MapObject obj=selected.getOccupant();
        
        if( (!terrain.isEmpty()) && (obj instanceof MilitaryUnit)&& ((MilitaryUnit)obj).getCanAttack() 
        		&& (terrain.getOccupant().getOwner()!=playerCivilization ) ) 
        {
        	((MilitaryUnit)obj).attack(terrain.getOccupant());
        	
        	if(obj.isDestroyed())
        	  selected.setOccupant(null);
        	
        	if(terrain.getOccupant().isDestroyed())
        		terrain.setOccupant(null);
        	
        	return true;
        }
        	
        return false;
    }

    
    /**
     * This method examines if the object which is currently selected can be converted into a Building(invoke method
     * {@linkplain model.Convertable#canConvert(TileType)}) and if it can be converted,it converts the Unit object 
     * which is currently selected into a Building (invoke method {@linkplain model.Convertable#convert()}) and returns
     * true,otherwise returns false
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     * @return true if the object Unit is converted to Building,false otherwise.
     */
    public static boolean convertSelected() {
        Convertable worker = (Convertable) selected.getOccupant();
        if (worker.canConvert(selected.getType())) {
            selected.setOccupant(worker.convert());
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * This method calls the method  {@linkplain model.MapObject#tick()} for every object inside of the map.If in
     * one position there isn't an object type of {@linkplain model.MapObject} or of an descendant class (which means
     * the position to be null) then the method in that time is not invoked.The tick()-method's signature  is defined 
     * in class{@linkplain model.MapObject} but the implementation of the method is given in different versions in 
     * different classes which extend class {@linkplain model.MapObject}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     * 
     */
    public static void tick() {
        for (int r = 0; r < map.getRows(); r++) {
            for (int c = 0; c < map.getColumns(); c++) {
                if (!map.getTile(r, c).isEmpty()) {
                    map.getTile(r, c).getOccupant().tick();
                }
            }
        }
    }

    
    
    /**
     * Examines if the player have accomplish a Technology win( {@linkplain model.Technology#hasTechnologyWin()})
     * or a Strategy win( {@linkplain model.Strategy#conqueredTheWorld()}) and returns the result.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the player has win the game ,false if not yet
     */
    public static boolean checkWin() {
        return playerCivilization.getTechnology().hasTechnologyWin()
            || playerCivilization.getStrategy().conqueredTheWorld();
    }

    /**
     * This method is used to invest on an object type of {@linkplain model.MapObject} only when the Civilization which
     * owns the selected object type of {@linkplain model.MapObject}(more specific type of {@linkplain model.Building} )
     * has more than 20 coins.If it has then the  method {@linkplain model.Building#invest()} is invoked  and 20 coins 
     * are removed from the Civilization Treasury(){@linkplain model.Treasury#spend(int)} and also send true.If the
     * Civilization do not have enough coins the method returns false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the civilization has 20 coins at least to invest otherwise false
     */
    public static boolean investSelected() {
        if (playerCivilization.getTreasury().getCoins() >= 20) {
            ((Building) selected.getOccupant()).invest();
            playerCivilization.getTreasury().spend(20);
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * This method examines if a demolish of a building can be done.In order to demolish an object type of 
     *  {@linkplain model.Building} the building must not be type of Settlement if the number of  settlements are equal
     *  or less than 1.If the demolish on the object  type of Building can be done the method invokes the method  
     *  {@linkplain model.Building#demolish()} and returns true,otherwise it do not invoke the method and returns false.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the demolish was successful,false otherwise
     */
    public static boolean demolishSelected() {
        if (selected.getOccupant() instanceof Settlement
            && playerCivilization.getNumSettlements() <= 1) {
            return false;
        } else {
            ((Building) selected.getOccupant()).demolish();
            selected.setOccupant(null);
            return true;
        }
    }
}
