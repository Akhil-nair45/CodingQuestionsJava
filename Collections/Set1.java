package Collections;

import java.util.HashSet;
import java.util.Iterator;

// set doesnt store duplicate values 
// set doesnt follow insertion order nor sorting order, whereas list follows insertion order but doesnot follows sortring order
// set doesnt support index value, list support index value 
// if u want sorted value use tree set (next example)

public class Set1 {
    public static void main(String[] args) {
        
        HashSet nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(30);
        nums.add(40);

        System.out.println(nums);

        Iterator itr = nums.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
