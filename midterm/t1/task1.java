package midterm.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Demonstrates basic list manipulation by mapping integer indices
 * from one list to string values in another list.
 * 
 * Creates:
 * - list1: a list of integers (used as 1-based indices)
 * - list2: a list of strings
 * - list3: a result list containing elements from list2 based on values in list1
 *
 * Prints the resulting list3.
 */

public class task1 {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 10, 6, 3, 7, 8, 1, 4, 9, 5));  
        List<String> list2 = new ArrayList<>(Arrays.asList("snr", "uab", "spi", "tyq", "ydc", "jpe", "rad", "lpt", "pzp", "rcl", "cqz", "gnv"));
        List<String> list3 = new ArrayList<>();
        
        // Add elements from list2 using 1-based indices from list1
        for (int i = 0; i < list1.size(); i++){
            list3.add(list2.get(list1.get(i) - 1));
        }

        System.out.println(list3);
    }
}
