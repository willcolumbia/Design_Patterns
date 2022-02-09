package Iterator;
import java.util.Iterator;
/**
 * the exercise iterator
 */
public class ExerciseIterator {
    private Exercise[] exercises;
    private int position = 0;
    /**
     * sets the exercises to the exercises passed
     * @param exercises
     */
    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    } 
    /**
     * checks if there are more exercises to iterate over
     * returns true if there is
     * @return true or false
     */
    public boolean hasNext() {
        if(position >= exercises.length || exercises[position] == null){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * if there are more excercises to iterate over, return the next exercise
     * @return null or theExercise
     */
    public Exercise next() {
        if(!hasNext()){
            return null;
        }
        Exercise theExercise = exercises[position];
        position++;
        return theExercise;
    }
    
}
