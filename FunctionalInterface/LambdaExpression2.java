package FunctionalInterface;

// here we are using lambda expression with the paramters passed in previous we have implemented it wothout parameter

@FunctionalInterface
interface A2 
{
    void show2(int i );
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        A2 obj = (int i) -> System.out.println("in lambda expression show"+" : "+i);
        obj.show2(1);
    }
}

// now we will see two paramters with return type in next example
