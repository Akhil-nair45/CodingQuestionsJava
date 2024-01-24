package AbstractClassQuestions;

abstract class A 
{
    public abstract void show();  // as soon as u make this method static u cant access it or override it
}

class B extends A
{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

}


public class Abstract1 {
    public static void main(String[] args) {
        
    }
}
