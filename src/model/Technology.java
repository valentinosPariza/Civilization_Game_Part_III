package model;


/**
 * 
 * This class is used to describe the Technological level of a civilization inside an object.This class has attributes
 * which represent the points which a civilization earns in Technology and some other to represent if the civilization
 * has reached a level which is assumed to be a great level for winning ,as also and some instance methods which are
 * used for completing some functions on the attributes like increasing the points of build_experience ,checking
 * if the player has reached the level of winning in technology and more other.This class includes: 
 * Instance variables: 
 * {@linkplain model.Technology#builtWonderOfTheWorld}
 * {@linkplain model.Technology#understanding}
 * {@linkplain model.Technology#buildExperience}
 * {@linkplain model.Technology#foundMeaningOfLife}
 * And instance methods:
 * {@linkplain model.Technology#builtWonderOfTheWorld()}
 * {@linkplain model.Technology#getBuildExperience()}
 * {@linkplain model.Technology#getUnderstanding()}
 * {@linkplain model.Technology#hasTechnologyWin()}
 * {@linkplain model.Technology#improveWriting()}
 * {@linkplain model.Technology#increaseBuildExperience(int)}
 * {@linkplain model.Technology#philosophize()}
 * {@linkplain model.Technology#increaseBuildExperience()}
 * {@linkplain model.Technology#increaseUnderstanding(int)}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 1/4/2018
 *
 */
class Technology {

    private int buildExperience;
    private boolean builtWonderOfTheWorld;

    private int understanding;
    private boolean foundMeaningOfLife;

    
    
    
    /**
	 * Returns the points of understanding  inside the attribute {@linkplain model.Technology#understanding}
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the points earned in the section of understanding
	 */
    public int getUnderstanding() {
        return understanding;
    }

    
    
    /**
	 * Returns the points of building experience inside the attribute {@linkplain homework2.Technology#experienceLevel}
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return the points earned in the section of building experience
	 */
    public int getBuildExperience() {
        return buildExperience;
    }

    
    
    /**
	 * Increases the points of the building experience attribute by 20 !Also after this,it  checks
	 * if this increase has completed the task of reaching totally 200 points in building experience and if it 
	 * actually reached this level,it makes the flag-boolean attribute for Building the Wonder of the World true.
	 * 
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 *
	 */
    public void increaseBuildExperience() {
        buildExperience += 20;
        builtWonderOfTheWorld = (buildExperience >= 200);
    }

    
    
    
    /**
	 * Increases the points of the building experience attribute !Also after this,it  checks
	 * if this increase has completed the task of reaching totally 200 points in building experience and if it 
	 * actually reached this level,it makes the flag-boolean attribute for Building the Wonder of the World true.
	 * 
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @param i an integer number representing the points to be added to the present build experience points
	 *
	 */
    public void increaseBuildExperience(int i) {
        buildExperience += i;
        builtWonderOfTheWorld = (buildExperience >= 200);
    }

    
    
    
    /**
     * A getter method returning  a boolean value representing if the task built Wonder of The world has been 
     *  accomplished .
     *  
     * @author valentinos Pariza 
	 * @since 1/4/2018
     * @return a boolean value representing if the task built Wonder of The world has been accomplished 
     */
    public boolean builtWonderOfTheWorld() {
        return builtWonderOfTheWorld;
    }

    
    /**
     * This method increases the amount of uunderstanding({@linkplain model.Technology#understanding})
     * and also updates the flag {@linkplain model.Technology#foundMeaningOfLife} if the understanding points have 
     * reached or transcend the number 200
     * @author Valentinos Pariza 
	 * @since 1/4/2018
     * @param increase the amount of understanding points to be increased to be increased
     */
    public void increaseUnderstanding(int increase) {
        understanding += increase;
        foundMeaningOfLife = (understanding >= 200);
    }

    
    
    /**
	 * Increases the understanding points of a Technology object by 25,by calling method 
	 * {@linkplain model.Technology#increaseUnderstanding(int)} with parameter 25
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 */
    public void philosophize() {
        increaseUnderstanding(25);
    }

    
    /**
	 * Increases the points of the understanding attribute by 20,by calling method
	 *  {@linkplain model.Technology#increaseUnderstanding(int)} with parameter 20
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * 
	 */
    public void improveWriting() {
        increaseUnderstanding(10);
    }

    
    
    /**
	 * Checks whether a Found of meaning of Life {@linkplain model.Technology#foundMeaningOfLife} and built a 
	 * wonder of the world {@linkplain model.Technology#builtWonderOfTheWorld} have achieved.In the reality it 
	 * checks if the previous two attributes are true and returns the boolean answer.
	 * 
	 * @author valentinos Pariza 
	 * @since 1/4/2018
	 * @return if {@linkplain model.Technology#builtWonderOfTheWorld} or 
	 *  		{@linkplain model.Technology#foundMeaningOfLife} is true
	 */
    public boolean hasTechnologyWin() {
        return builtWonderOfTheWorld || foundMeaningOfLife;
    }
}
