package model;

import java.util.Random;
/**
 * This class represents the map.All the objects like,settlements ,units,buildings etc are presented in this object 
 * .The objects of this class are using a two-dimensional array type of {@linkplain model.TerrainTile} which each
 * object (of this type) inside the array represent every object.So in some words this class creates objects which 
 * have organized sets of objects which are used to execute complete all the operations between them,inside the set.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class Map {

    private TerrainTile[][] map;				

    /**
     * Constructor of an object type of thisclass.Takes the number of the rows and the columns of the desirable array
     *  and creates it.In every position in the array the method puts an object type of {@linkplain model.TerrainTile}
     *  which is created by method  {@linkplain model.TerrainTile#TerrainTile(TileType)} using a random object type of 
     *   {@linkplain model.TileType}.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param rows the number of rows of the array which will be created inside the object type of this class
     * @param columns the number of columns of the array which will be created inside the object type of this class
     */
    public Map(int rows, int columns) {
        TileType[] types = TileType.values();
        
        map = new TerrainTile[rows][columns];
        Random rand = new Random();
        
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                map[r][c] = new TerrainTile(types[rand.nextInt(types.length)]);
            }
        }
    }

    
    /**
     * This method returns an object type of {@linkplain model.TerrainTile} which is located in row r and column c 
     * (which are given as parameters) in the array of the object type of this class 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an object type of  {@linkplain model.TerrainTile} 
     */
    public TerrainTile getTile(int r, int c) {
        return map[r][c];
    }

    
    /**
     * Returns whether the position defined by the parameters is Empty or it has an object(not Empty). 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the position in the array is null,false otherwise
     */
    public boolean isEmpty(int r, int c) {
        return map[r][c].getOccupant() == null;
    }

    
    /**
     * This method returns the number of the rows of the two-dimensional array of the object invoking the method
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an integer number representing the number of the rows of the two-dimensional array
     */
    public int getRows() {
        return map.length;
    }

    
    
    /**
     * This method returns the number of the columns of the two-dimensional array of the object invoking the method
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return an integer number representing the number of the columns of the two-dimensional array
     */
    public int getColumns() {
        return map[0].length;
    }

    
    
    /**
     * This method is overridden(inherited from class Object)
     * This method creates a String which represents the map,which map is described by the object type of 
     * {@linkplain model.Map} which invokes the method.With this representation of the map all objects like buildings,
     * units,settlements and terrain types are presented in the String.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String representation of the object invoking the method
     */
    public String toString() {
        String ret = "";

        for (int i = 0; i < map[0].length / 2; i++) {
            ret += "      ____";
        }

        if (map[0].length % 2 == 1) {
            ret += "      ____";
        }
        ret += "\n";

        for (int r = 0; r < map.length; r++) {
            String rowString = "";
            for (int c = 0; c < map[r].length; c += 2) {
                TerrainTile tile = map[r][c];
                String tileString = tile.symbol() + ""
                    + (tile.getOccupant() != null
                        ? tile.getOccupant().symbol()
                        : ' ')
                    + "" + r + "" + c;
                rowString += "____/" + tileString + "\\";
            }
            if (map[r].length % 2 == 0) {
                rowString += "____";
            }
            rowString = "     " + rowString.substring(4);
            if (r != 0 && map[r].length % 2 == 0) {
                rowString += "/";
            }
            rowString += "\n     ";
            for (int c = 1; c < map[r].length; c += 2) {
                TerrainTile tile = map[r][c];
                String tileString = tile.symbol() + ""
                    + (tile.getOccupant() != null
                        ? tile.getOccupant().symbol()
                        : ' ')
                    + "" + r + "" + c;
                rowString += "\\____/" + tileString;
            }
            if (map[r].length % 2 == 0) {
                rowString += "\\";
            } else {
                rowString += "\\____/";
            }
            rowString += "\n";
            ret += rowString;
        }

        ret += "      ";

        for (int i = 1; i < map[0].length; i += 2) {
            ret += "    \\____/";
        }

        return ret + "\n";
    }
}
