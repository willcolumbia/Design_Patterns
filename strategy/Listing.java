package strategy;
import java.util.ArrayList;
/**
 * A list of Objects 
 * @author Will Columbia
 */


public class Listing {
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;
    
    public Listing(String title) {
        this.title = title;
        items = new ArrayList<String>();
        this.sortBehavior = new BubbleSort();
    }
    /**
     * Adds items to the list
     * @param item
     */
    public void add (String item) {
       items.add(item);

    }
    /**
     * removes items from the list
     * @param item
     */
    public void remove(String item) {
        items.remove(item);
    }
    /**
     * gets the title of the item
     * @return title of the item
     */
    public String getTitle() {
        return title;
    }
    /**
     * sets the sort behavior between bubble sort and insertion sort
     * @param sortBehavior
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        sortBehavior = this.sortBehavior;
    }
    /**
     * gets the sorted list
     * @return the sorted list
     */
    public ArrayList<String> getSortedList() {
        return sortBehavior.sort(items);
    }
    /**
     * gets the unsorted list
     * @return the unsorted list
     */
    public ArrayList<String> getUnSortedList() {
        Listing unsorted;
        return unsorted;
    }
}
