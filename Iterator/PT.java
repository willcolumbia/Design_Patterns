package Iterator;

import java.util.ArrayList;
/**
 * A personal trainer class that holds the first name, last name and bio for a personal trainer. Also holds the number of exercises  
 * @author Will Columbia
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    static final int MAX_EXCERCISES = 3;
    int numOfExercises = 0;
/**
 * sets the first/last name and bio based on the information passed. Creates new excersise array of size of the max excersises
 * @param firstName
 * @param lastName
 * @param bio
 */
    public PT(String firstName,String lastName,String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercises = new Exercise[MAX_EXCERCISES];
        
    }
    /**
     * Creates a new instance of Exercise with information passed. Checks if the number of exercises is too many then the array size is doubled
     * @param title
     * @param muscleGroups
     * @param directions
     */
    public void addExercise(String title,ArrayList<String>muscleGroups,ArrayList<String>directions){
        Exercise exercise = new Exercise(title,muscleGroups,directions);
        if(numOfExercises > MAX_EXCERCISES){
            growArray(exercises);
        }
        else{
            exercises[numOfExercises] = exercise;
            numOfExercises = numOfExercises +1;
        }
    }
    /**
     * gets the first name of the PT
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * gets the last name of the PT
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * gets tthe PT's bio
     * @return bio
     */
    public String getBio(){
        return bio;
    }
    /**
     * creates a new array that is double the size of the original array. fills the new array with the old arrays data.
     * @param exercises
     * @return moreExercises
     */
    private Exercise[] growArray(Exercise[] exercises){
        Exercise[] moreExercises = new Exercise[exercises.length*2];
        for(int i=0;i<exercises.length;i++){
            moreExercises[i] = exercises[i];
        }

        return moreExercises;
    }
    /**
     * returns a new Exercise iterator using the exercise array
     * @return
     */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(exercises);
    }
    /**
     * creates and returns a string for the first/last name and bio of the PT
     * @return trainer
     */
    public String toString(){
       String trainer = (firstName+" "+lastName+"\n"+bio);
       return trainer;
    }
}
