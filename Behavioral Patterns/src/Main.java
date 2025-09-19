import StrategyPattern.Strategy.QuickSortStrategy;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>(5);

        for (int i = 0; i < 5; ++i) {
            ar.add(scn.nextInt()); // use add, not set
        }
        Sortable sortable = new Sortable(new QuickSortStrategy());

        sortable.sortList(ar);
    }
}