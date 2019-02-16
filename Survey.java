import java.util.Scanner;

/**
 * This class gets the input of the user of their most preferred criteria for study spots at the University of Calgary.
 * This is done by asking the user a survey that contains 5 questions.
 *
 * Last modified: February 16th, 2019
 */

public class Survey {
    private double noiseLevel, bathroomsNearby, foodNearby, seatingSpace, outlets;

    /**
     * Default Constructor for Survey object
     */ 
    public Survey () {
        this.noiseLevel = noiseLevel;
        this.bathroomsNearby = bathroomsNearby;
        this.foodNearby = foodNearby;
        this.seatingSpace = seatingSpace;
        this.outlets = outlets;
    }

    /**
     * Constructor for Survey object which takes the noiseLevel, bathroomsNearby, foodNearby, seatingSpace and outlets as arguments
     * @param noiseLevel: double to set as the initial noiseLevel
     * @param bathroomsNearby: double to set as the initial amount for bathroomsNearby  
     * @param foodNearby: double to set as the initial amount for foodNearby
     * @param seatingSpace: double to set as the initial amount for seatingSpace
     * @param outlets: double to set as the initial amount for outlets
     */ 
    public Survey (double noiseLevel, double bathroomsNearby, double foodNearby, double seatingSpace, double outlets) {
        this.noiseLevel = noiseLevel;
        this.bathroomsNearby = bathroomsNearby;
        this.foodNearby = foodNearby;
        this.seatingSpace = seatingSpace;
        this.outlets = outlets;
    }

    /**
     * Copy Constructor for Survey object
     * @param surveyToCopy: Survey object to be copied
     */ 
    public Survey (Survey surveyToCopy) {
        this.noiseLevel = surveyToCopy.noiseLevel;
        this.bathroomsNearby = surveyToCopy.bathroomsNearby;
        this.foodNearby = surveyToCopy.foodNearby;
        this.seatingSpace = surveyToCopy.seatingSpace;
        this.outlets = surveyToCopy.outlets;
    }

    /**
     * Returns a double representing the noiseLevel of the user's ideal study spot.  
     */ 
    public double getNoiseLevel () {
        return this.noiseLevel;
    }

    /**
     * Returns a double representing the amount of bathroomsNearby of the user's ideal study spot.  
     */ 
    public double getBathroomsNearby () {
        return this.bathroomsNearby;
    }

    /**
     * Returns a double representing the amount of foodNearby of the user's ideal study spot.  
     */ 
    public double getFoodNearby () {
        return this.foodNearby;
    }

    /**
     * Returns a double representing the amount of seatingSpace of the user's ideal study spot.  
     */ 
    public double getSeatingSpace () {
        return this.seatingSpace;
    }

    /**
     * Returns a double representing the amount of outlets of the user's ideal study spot.  
     */ 
    public double getOutlets () {
        return this.outlets;
    }

    /**
     * Sets the indicator of noise level to the new given value
     * @param noiseLevel: double representing the noise level of the user's ideal study spot
     */
    public void setNoiseLevel (double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    /**
     * Sets the amount of bathroomsNearby to the new given value
     * @param bathroomsNearby: double representing the amount of bathroomsNearby of the user's ideal study spot
     */
    public void setBathroomsNearby (double bathroomsNearby) {
        this.bathroomsNearby = bathroomsNearby;
    }

    /**
     * Sets the amount of bathroomsNearby to the new given value
     * @param foodNearby: double representing the amount of foodNearby of the user's ideal study spot
     */
    public void setFoodNearby (double foodNearby) {
        this.foodNearby = foodNearby;
    }

    /**
     * Sets the seatingSpace amount to the new given value
     * @param seatingSpace: double representing the seatingSpace amount of the user's ideal study spot
     */
    public void setSeatingSpace (double seatingSpace) {
        this.seatingSpace = seatingSpace;
    }

    /**
     * Sets the amount of outlets to the new given value
     * @param outlets: double representing the amount of outlets in the user's ideal study spot
     */
    public void setOutlets (double outlets) {
        this.outlets = outlets;
    }


    /**
     * Asks the user questions where the user gets to rank their preferences on 5 criteria to determine their ideal study spot
     * If the user inputs a double outside of the 1-10 scale then the question reprompts
     * @param criteria: a string representing the criteria to be asked in the question of the survey 
     * @return criteriaInput: a double representing the value of the user's preference of the given criteria in a given 1-10 scale 
     */
    public double askSurveyQuestions (String criteria) {
        boolean isTrue = false;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("On a scale of 1-10, what's the amount of " + criteria + " that you prefer? (1 = doesn't matter to me, 10 = required for me to study.)");
        double criteriaInput = keyboard.nextDouble();
        while (isTrue == false) {
            if (criteriaInput >= 1.0 && criteriaInput <= 10.0) {
                isTrue = true; 
                return criteriaInput;
            }
            else {
                System.out.println("On a scale of 1-10, what's the amount of " + criteria + " that you prefer? (1 = doesn't matter to me, 10 = required for me to study.)");
                criteriaInput = keyboard.nextDouble();
                isTrue = false;
            }
        }
        return 0.0;
    }

    /**
     * Tests for the Survey class
     */

    public static void main (String [] args) {
        Survey aPerson = new Survey ();
        aPerson.setNoiseLevel(aPerson.askSurveyQuestions("noise level"));
        aPerson.setBathroomsNearby(aPerson.askSurveyQuestions("bathrooms nearby"));
        aPerson.setFoodNearby(aPerson.askSurveyQuestions("food nearby"));
        aPerson.setSeatingSpace(aPerson.askSurveyQuestions("seating space"));
        aPerson.setOutlets(aPerson.askSurveyQuestions("outlets"));
       
        System.out.println(aPerson.getNoiseLevel());
        System.out.println(aPerson.getBathroomsNearby());
        System.out.println(aPerson.getFoodNearby());
        System.out.println(aPerson.getSeatingSpace());
        System.out.println(aPerson.getOutlets());
    }
    
}