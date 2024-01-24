package ExceptionsJava;

public class ExceptionTryCatch {
    public static void main(String[] args) {
        int i =0;
        int j=0;

        try{
            j=16/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.....");
        }
        System.out.println(j);

        System.out.println("Bye!!!!");
    }
}
