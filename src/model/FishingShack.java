package model;

import java.util.Random;

/**
 * This class is a subclass of the class Building,which means that this class inherits all the public methods and 
 * instance variables of the parent class Building.Every object of this class represents a special building of 
 * a fishing shack.With the objects of this class it is possible to represent the occupation of fishing for a 
 * civilization which increases the quantity of food of a civilization.This class uses as an attribute the class
 * {@linkplain model.Fish} which is the class which its objects play a big role in defining this class.
 * 
 * @author valentinos Pariza
 * @since 2/4/2018
 * 
 */
class FishingShack extends Building {
	
    private Fish[] fish;				//  every fishing shack have an array with the possible objects type of 
    									//  Fish that can gain with fishing 	
    
    private int numFish;				//  the current index which shows the Fish in the array of Fish of this class 
    
    private static Random rand = new Random();

    /**
     * A constructor which creates an object type of this class on  a Civilization object which owns this object(
     * object Civilization is given as a parameter) and also creates an object type of {@linkplain model.Building} 
     * inside this  object of this class by calling the constructor(super) of the superclass.Also every time 
     * which an object type of this class is created the method {@linkplain model.FishingShack#invest()} is called.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @param owner an object type of {@linkplain model.Civilization} which owns this object type of this class
     */
    public FishingShack(Civilization owner) {
        super(200, owner, 5, 0, 10, 0, 0, 10);			// these characteristics are being stored to attributes 
        fish = new Fish[5];								// in class Building which that class is a superclass 
        invest();										// of the parent class
    }

    
    
    /**
     * This method is defined here but its signature was written in upper level.In abstract class 
     * {@linkplain model.Building}.This class  makes an investment on upgrading fishing shack.More specific it 
     * increases the amount of food and gold generation which are producing every round by calling the methods
     * {@linkplain model.Building#setFoodGeneration(int)} and {@linkplain model.Building#setGoldGeneration(int)}.
     * This increasement of food and gold generation is made by passing every object {@linkplain model.Fish} on the 
     * array of  fish of an object type of {@linkplain model.FishingShack},food generation  is increased by the value 
     * of food which offers every fish({@linkplain model.Fish#getHealth()}) in the array divided by 2 and gold 
     * generation is increased by  the points which every object in the array offers minus the present food generation.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * 
     */
    @Override
    public void invest() {
        replenishFish();
        int foodGeneration = 0;
        int goldGeneration = 0;
        
        for (Fish f : fish) {
            foodGeneration += (int) (f.getHealth() / 2);
            goldGeneration += f.getHealth() - foodGeneration;
        }
        setFoodGeneration(foodGeneration);
        setGoldGeneration(goldGeneration);
    }

    
    
    /**
     * This method which is received by superclass(From interface symbol which a superclass implements and this class
     * defines it) implements this method which returns the special symbol of this type of {@linkplain model.MapObject}.
     * {@linkplain model.MapObject} is the parental class of the class {@linkplain model.Building} which with its 
     * turn it is parent of this class.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a character which represents this object type of {@linkplain model.FishingShack}
     */
    @Override
    public char symbol() {
        return '&';
    }

    
    /**
     * This method returns an object type of {@linkplain model.Fish} of the array of Fish ,if the index of the array 
     * hasn't reached the end of the array(from the end at the beginning),otherwise returns null and also every time 
     * which an object is taken from the array the index showing in a position on the array is decrease by one. 
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return null or an object type of {@linkplain model.Fish} which finds it inside the array of the object type of 
     * {@linkplain model.FishingShack}
     * 
     */
    public Fish getFish() {
        if (numFish == 0) {
            return null;
        }
        Fish caught = fish[--numFish];
        return caught;
    }

    
    /**
     * This method refills the array of Fish of an object type of {@linkplain model.FishingShack} if the index is 
     * showing in a position outside the range of the usable positions.More specific if the index is zero is showing 
     * that there are 0 fish to gain,which means nothing to fish.Also returns whether the method has refilled(true)
     * or not(false) the array of fish.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return true if the array of Fish was refilled otherwise false
     */
    public boolean replenishFish() {
        if (numFish == 0) {
            for (int i = 0; i < fish.length; i++) {
                fish[i] = new Fish(rand.nextInt(5));
                numFish++;
            }
            return true;
        }
        return false;
    }

    
    /**
     * This class creates a String in order to represent the objects type of {@linkplain model.FishingShack} by 
     * also calling the method {@linkplain model.Building#toString()} of the ancestor class.
     * 
     * @author valentinos Pariza
     * @since 2/4/2018
     * @return a String representation of an object type of this class
     */
    @Override
    public String toString() {
        return "FishingShack. " + super.toString();
    }
}
