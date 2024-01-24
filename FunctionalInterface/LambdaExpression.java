package FunctionalInterface;

// lambda expression can only be used in functional interface 

@FunctionalInterface
interface A1 
{
    void show1();
}


public class LambdaExpression {
    public static void main(String[] args) {
        // here we are implementing lambda expression

        // way -1 if u have multiple statements
        A1 obj = () -> 
        {
            System.out.println("In lambda expression show way-1 ");
        };
        obj.show1();


        // way 2 if u have single statements
        // even if u have only one line to print sout then u cn also write like this to further reduce the code length
        A1 obj1 = () -> System.out.println("In lambda expression show way-2 ");
        obj1.show1();
    }
}

// what if we have some parameter or some arguments we can see it in next code