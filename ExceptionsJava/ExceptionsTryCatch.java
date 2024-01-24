package ExceptionsJava;

public class ExceptionsTryCatch {

    // multiple catch block with try exception
    public static void main(String[] args) {
        int i =4;  // u can change the value of i to 0 and then run the code u can see arithmetic exc is occured and due to which remaining code isnt executed but as soon as u change to 4 the next exception is indexoutofboud exception and it will occur as we have printed the value of 6 as array size is 5 so index value will be max 4 as it starts with 0 so we cant fetch the value of index 6
        int j=0;

        int nums[] = new int [5];
        String str= null;  // we r doing a nrw exception below

        try
        {
            j=16/i;
            System.out.println(nums[1]);
            System.out.println(nums[3]);
            // like here we r if not sure what exceptiom name is thusis then we can create a exception e common and we can print the exception 
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("An Arithmetic exception occured, Something went wrong......");
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("An ArrayIndexOutOfBoundsException occured, please eneter a valid array index number!!!!!");
        }
        catch(Exception e)  //always remember parent exception should be at bottom not first, just put this at top and u will se error so always write this at the end 
        {
            System.out.println("Something went wrong....."+e);
        }
        System.out.println(j);
        System.out.println("bye!!!!");
    }
}
