package InnerClass;

// this is the example of annonymous inner class where we dont have to create the class specially instead we can use this method
// if in normal case we have to first create the class and then in main method we have to create obj of that class and then we can access the methods
// here we are directly creating and calling in main class


// here we tried the above method but later we came to know that we have to create a class but if we want to override the class/method we can by AIC 

class A1 
{
    public void show()
    {
        System.out.println("in class A show");
    }
}



public class AnnonymousInnerClass1 {
    public static void main(String[] args) {
        A1 a = new A1(){
            public void show()
            {
                System.out.println("in  anonymous class A show");
            }
        };
        a.show();


        

    }
}
