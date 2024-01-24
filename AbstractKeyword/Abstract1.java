package AbstractKeyword;

abstract class car 
{
    public abstract void drive ();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Music Playing!!!!");
    }
}

abstract class wagonR extends car{     //here we only want to implement the drive method so it will gove error bcoz if u r extending an abstract class that class should override all the abstract methods so if u want to overcome this problem like if u only want to use the drive method and u dont want to implement the fly method then u have to make the wagonr class also abstract

   public void drive()
   {
    System.out.println("Driving!!!!");
   }
    
}

class updatedWagonR extends wagonR
{
    public void fly()
    {
        System.out.println("Flying!!!!");
    }
}




public class Abstract1 {
    public static void main(String[] args) {
        
        car c = new updatedWagonR();
        c.drive();
        c.fly();
        c.playMusic();
        // System.out.println(c);
    }
}
