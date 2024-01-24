package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// map stores data in key value pair
// map the value can be duplicate key cant be, if key is duplicate it will override the latest one 
// map doesnt follows the insertion order
// map doesnt follows the sorting order
// Map<String,Integer> is written in code just to know the compiler that the key is in string value and value is in integer format it is knwon as k,v




public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Akhil", 1);
        students.put("Akhil Nair",1);
        students.put("Ram",2 );
        students.put("Harshil", 3);
        students.put("Madhur", 4);
        System.out.println(students);
        System.out.println(students.keySet());

        for(String names : students.keySet())
        {x
            System.out.println(names + " : "+students.get(names));
        }

        // we cant use this method instead use this method above one
    //     Iterator itr = ((Object) students).iterator();
    //     while (itr.hasNext()) {
    //         System.out.println(itr.next());
    // }
}
}