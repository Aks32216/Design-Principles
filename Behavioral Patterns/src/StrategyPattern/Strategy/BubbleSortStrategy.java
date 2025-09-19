package StrategyPattern.Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(ArrayList<Integer> arr){
        System.out.println("Sorting through bubble sort strategy");
        Collections.sort(arr);
    }
}
