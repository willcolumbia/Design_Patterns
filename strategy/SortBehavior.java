package strategy;
import java.util.ArrayList;
/**
 * interface used by bubbleSort and insertionSort 
 * Listing has a sorting behavior 
 * @author Will Columbia
 */
public interface SortBehavior {
    public ArrayList<String> sort(ArrayList<String> data);
}
