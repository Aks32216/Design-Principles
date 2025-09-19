package StrategyPattern.Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(ArrayList<Integer> arr){
        System.out.println("Sorting through Quick sort strategy");
        Collections.sort(arr);
    }
}
