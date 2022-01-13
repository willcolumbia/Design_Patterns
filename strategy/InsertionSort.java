package strategy;

import java.util.ArrayList;

public class InsertionSort implements SortBehavior {

    @Override
    public ArrayList<String> sort(ArrayList<String> data) {
        for(int i = 1;i<data.size();i++) {
            String current = data.get(i);
            int j = i-1;
            while((j > -1) && (data.get(j).compareTo(current)) == 1) {
                data.set(j+1, data.get(j));
                j--;
            }       
            data.set(j+1, current);
        }
        return data;
    }
    
}
