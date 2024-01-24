package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,7,9,8);
        System.out.println(nums);
        nums.forEach(n -> System.out.println(n));

         List<Integer> list=nums.stream().filter(i->i%2==0).collect(Collectors.toList()); 
         System.out.println(list);

        List<Integer> nnn= nums.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(nnn);

        //  or u can do like this way
        for(int n : nums )
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
        System.out.println(nums);
    }



    // if we want to print all the values in a array list one by one or get it one by one then we can use many method normal for loop, enhanced for loop , and the for each loop
    // normal for loop
    // for(int i=0; i<nums.size();i++)
    // {
    //     System.out.println(nums.get(i));
    // }

    // emhanced for loop
    // for(int n : nums )
    // {
    //     System.out.println(n);
    // }



    // for each loop
    // written on line no 11
    // nums.foreach(n ->sout(n));
    
}
