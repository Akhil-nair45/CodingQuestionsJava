package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        
        // List nums = new ArrayList<>();
        // nums.add(5);
        // // nums.add("Akhil");
        // nums.add(6);
        // // nums.add("Harshil");
        // nums.add(8);
        // nums.add(7);
        // nums.add(9);




        // instead of adding like the above method we can also add like this
        List<Integer> nums = Arrays.asList(4,5,2,3,5,1); //but the problem is we cant store heterogenous data as we have already mentioned the data type







        System.out.println(nums+"before collections.sort");

        // we can do sorting with the help of collection.sort 
        Collections.sort(nums);  // here we cant store heterogenous data if u want to use collections.sort

    
        Iterator itr = nums.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
