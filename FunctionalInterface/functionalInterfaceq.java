package FunctionalInterface;
// here we are going to define the functional interface it is something that only contains only one method in an interface
// so basically an interface with only one method is called functional interface

@FunctionalInterface   // this annotation is used so that if more than one method is made compiler will throw an error 
interface A 
{
    void show();
    // void config();  //so here as soon as we write the second method we csn see the compiler is giving an error 
}

// so now we cant create obj of an interface so either we can impl it to a class or with the help of anonymous class



public class functionalInterfaceq {
    public static void main(String[] args) {
        A obj = new A() {

            public void show()
            {
                System.out.println("in anonymoous classs show");
            }
        };
        obj.show();
    }
}
