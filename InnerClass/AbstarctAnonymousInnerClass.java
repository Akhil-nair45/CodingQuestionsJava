package InnerClass;



// here in first AIC example we have made a class now we are trying it with abstract class as we cant create object of the absteact class so ewr have to extends it with a class and then create an object of that class it was much lengthy so we can also use this method to get the answer
abstract class AB 
{
    public void config()
    {
        System.out.println("in class AB config");
    }
}
public class AbstarctAnonymousInnerClass {
    public static void main(String[] args) {
        AB ab = new AB() {
            public void config()
            {
                System.out.println("in AIC config");
            }
        };
        ab.config();
    }
}
