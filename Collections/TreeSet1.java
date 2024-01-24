package Collections;

import java.util.Iterator;
import java.util.TreeSet;


// tree set follows sorting order it doesnot follows insertion order
// tree set stores homomgenous data 
// tree set doesnt stores heterogenous data 



public class TreeSet1
{
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        // s.add(10);
        // s.add(30);
        // s.add(20);
        // s.add(30);
        // s.add(50);
        // s.add(40);
        s.add("abc");
        s.add("abd");
        s.add("a");
        System.out.println(s);

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}