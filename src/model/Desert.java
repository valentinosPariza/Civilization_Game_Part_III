package model;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
/**
 * 
 * This class represents the Desert in the game.It is used as a type of objects
 * in order to simulate a Dessert and some functions of it. 
 * {@linkplain model.Desert#rand}
 * {@linkplain model.Desert#scan} 
 * Two Instance Methods:
 * {@linkplain model.Desert#findTreasure()}
 * {@linkplain model.Desert#lost()}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Desert {
    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();

    
    
	/**
	 * This method is used in order to search the desert for treasure.This means
	 * that it generates a pseudorandom number (between 1-500)for treasure.If the player 
	 * is lost the program calls the method lost to make player decide if he/she wants 
	 * to escape and at the end returns back zero coins or the coins which player 
	 * finally has earned.This method uses method:
	 * {@linkplain model.Desert#lost()}.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return an integer number representing the coins which player has earned(if
	 *         he/she earned)
	 */
    public int findTreasure() {
    
    	
    	
        Random rand = new Random();
        
        int coins = rand.nextInt(500) + 1;
        double coinsAftertaxes=coins-coins/10;
        coins=(int) coinsAftertaxes;
        
        int possibility=rand.nextInt(10);
        
        if(possibility==0) 
        {
        	
        if (lost()) 
         {
            if (lost()) 
            {
                return 0;
            }
          }
        }
        return coins;
    }

    
    
    /**
	 * This method is used when player is lost in Desert(this is being checked in method 
	 * {@linkplain model.Desert#findTreasure()}).If this method is called ,it asks the player by using a Scanner 
	 * object from {@linkplain java.util.Scanner} if he/she wants to escape from desert.Then it returns his/her 
	 * decision.This method also  handles an Exception type of java.util.Exception.InputMismatchException  if one is 
	 * thrown  by the wrong type of input which may be given by user in trying of ecaping.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return a boolean expression that indicates if player wants to escape or not from desert
	 */
    public boolean lost() {
        System.out.println("You have gotten lost! Press 1 to try escaping the"
            + " Desert.\nHopefully you can make it out alive.");
        
        int move=0;
        boolean stop=false;
        
        while(!stop)
        {
        try {
        	
         move = scan.nextInt();
         stop=true;
        
        }
        catch(InputMismatchException e)
        {
        	scan.nextLine();
        	System.out.println("Give an integer number  :");
        }
        
        }
        return (move == 1) ? false : true;
    }
}
