package strategy;
import java.util.ArrayList;

public class BubbleSort implements SortBehavior{
    @Override
    public ArrayList<String> sort(ArrayList<String> data) {
        String temp;
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 0;i<data.size()-1;i++) {
                if(data.get(i).compareTo(data.get(i+1))>0) {
                    temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                    sorted = false;
                }
            }
        }
        return data; 
    }
}
