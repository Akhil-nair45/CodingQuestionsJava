package InnerClass;

class A {
    int a =10;

    public void show()
    {
        System.out.println("in show");
    }

    class B {
        public void config()
        {
            System.out.println("in config");
        }
    }
}


public class InnerClass1 {
    public static void main(String[] args) {
        
        // here we want to access both class A and inner class B so we have to first create obj of A class
        // and then by taking the refernce of A obj we can create obj of B class but creating obj of inner class
        // is also differnet we have to mention the super class of the inner class and then by the refernece obj of the super class we can call the inner class
        // as we can see below

        A obj = new A();
        obj.show();
        
        A.B obj1 = obj.new B();  // here we first initialised where class B is present (A.B) and then we have used the reference obj of A class to get the object of inner class B
        obj1.config();

        // also we can make the inner class static so that we dont need to create obj 
        // A.B = new A.B();   if we make the class B static then we can do it like this u can try using this also 
        
    }
}
