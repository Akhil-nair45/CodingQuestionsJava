import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      
        
        do{
              Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int n1= sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("Select a Symbol from these +,-,*,/");
        String s1=sc.next();

        int result;

        switch(s1){
            case "+": result = n1 + n2;
            System.out.println("Adddition is :"+result);
            break;

            case "-": result = n1 - n2;
            System.out.println("Substraction is :"+result);
            break;

            case "*": result = n1 * n2;
            System.out.println("Multiplication is :"+result);
            break;

            case "/": result = n1/n2;
            System.out.println("division is :"+ result);
            break;


            default: System.out.println("Invalid Expression selected");
        }
    }
}
}
    


        
   

        
    

