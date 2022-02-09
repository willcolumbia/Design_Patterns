package Iterator;

import java.util.ArrayList;
/**
 * an Exercise call that holds the exercises
 * @author Will Columbia
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
/**
 * sets the title to the title passed. creates new arraylsits targetMuscle and
 * directions
 * @param title
 */
    public Exercise(String title){
        this.title = title;
        targetMuscles = new ArrayList<String>();
        directions = new ArrayList<String>(); 
    }
    /**
     * setst the targetMuscles,directions,and title to the information passed
     * @param title
     * @param targetMuscle
     * @param directions
     */
    public Exercise(String title,ArrayList<String>targetMuscle,ArrayList<String>directions){
                this.targetMuscles = targetMuscle;
                this.directions = directions;
                this.title = title;
        
    }
    /**
     * adds a muscle to the targetMuscle arraylist
     * @param String muscle
     */
    public void addTargetMuscle(String muscle){
        targetMuscles.add(muscle);
    }
    /**
     * removes a muscle from the arralist targetMuscle
     * @param muscle
     */
    public void removeTargerMuscle(String muscle){
        targetMuscles.remove(muscle);

    }
    /**
     * creates and returns the workouts. Converts arraylist to a String 
     * returns targeted muscles as a comma seperated list
     * returns directions as a hyphenated list
     * 
     * (P.S I am aware that this is ugly and terrible in every way but it works)
     */
    public String toString(){
        //String for target muscles
        String targetMuscle = targetMuscles.toString();
        String remove1 = targetMuscle.replace("[", "");
        String remove2 = remove1.replace("]", "");
        targetMuscle = remove2;
        //String for Excersises
        String finalDirections = directions.toString();
        String addHyp = finalDirections.replace(",", ",-");
        String removeCom = addHyp.replace(",", "\n");
        String removeChar1 = removeCom.replace("[", "");
        String removeChar2 = removeChar1.replace("]", ".");
        finalDirections = removeChar2;
        String workouts = ("\n"+"... "+title+" ... \n"+"Muscles: "+targetMuscle+"\n"+"Exercises: \n"+"- "+finalDirections+"\n");
        return workouts;
    }
}
