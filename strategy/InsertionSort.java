package strategy;

import java.util.ArrayList;
/*
Using Interstion sort code from https://stackabuse.com/insertion-sort-in-java/
*/
public class InsertionSort implements SortBehavior {

    public ArrayList<String> sort(ArrayList<String> data) {
        for(int i = 1;i<data.size();i++) {
            String current = data.get(i);
            int j = i-1;
            while((j > -1) && ((data.get(j).compareTo(current)) == 1)) {
                data.set(j+1, data.get(j));
                j = j-1;
            }       
            data.set(j+1, current);
        }
        return data;
    }
    
}
/**
 * didnt think I would need to comment on this class considering I am not the author
 */