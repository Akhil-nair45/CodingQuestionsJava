package FunctionalInterface;
// here we will see the lambdaexpression with return type

@FunctionalInterface
interface A3 
{
    int add(int i, int j);
}



public class LambdaExpression3 {
    public static void main(String[] args) {
        // anonymous class way-1
        A3 obj = new A3() {
            public int add(int i, int j)
            {
                return i+j;
            } 
        };
         int result =obj.add(5, 4);
        System.out.println(result);





        // lambda expression way-2
        A3 obj1 = (int i, int j) ->
        {
            return i+j;
        };
        int result1 =obj1.add(5, 4);
        System.out.println(result1);






        // lambda expression way-3 more short we have one line so remove curly brackets and even dont write return just write i+j;
        A3 obj2 = (int i, int j) ->  i+j;
        int result2 = obj2.add(5, 4);
        System.out.println(result2);




          // lambda expression way-4 even more short we can remove even type int in parameter
        A3 obj3 = (i,j) ->  i+j;
        int result3 = obj3.add(5, 4);
        System.out.println(result3);

    }
}
