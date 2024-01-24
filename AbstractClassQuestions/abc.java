package AbstractClassQuestions;

interface aas 
{
   
    static int i1 =10;
    public static void show()
{
    System.out.println("Hi i am inside static method");
}
}

class abstarct211 implements aas
{
  
}

public class abc {
    public static void main(String[] args) {
        aas.show();
        System.out.println(aas.i1);
        
        
    }
}
