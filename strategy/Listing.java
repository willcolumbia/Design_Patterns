package strategy;
import java.util.ArrayList;

public class Listing {
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;
    
    public Listing(String title) {
        this.title = title;
    }
    public void add(String item) {

    }
    public void remove(String item) {

    }
    public String getTitle() {
        return title;
    }
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
    public ArrayList<String> getSortedList() {
        return items;
    }
    public ArrayList<String> getUnSortedList() {
        return items;
    }
}
