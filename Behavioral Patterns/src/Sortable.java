import StrategyPattern.Strategy.SortingStrategy;

import java.util.ArrayList;

public class Sortable {
    private SortingStrategy sortingStrategy;

    Sortable(SortingStrategy sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }

    public void sortList(ArrayList<Integer> arr){
        System.out.println("Sorting the array");
        sortingStrategy.sort(arr);

        System.out.println(arr);
    }

}
