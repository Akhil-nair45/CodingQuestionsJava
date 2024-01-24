package ExceptionsJava;

class AkhilException extends Exception
{
    public AkhilException(String message)
    {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j=0;

        try{
            j=18/i;
            if(j==0) throw new AkhilException("The Akhil exception occured!!!!");
        }
        catch(AkhilException e)
        {
            System.out.println("thats the custom exception!!!!!!"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured.......");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured........");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong............");
        }
    }
}
