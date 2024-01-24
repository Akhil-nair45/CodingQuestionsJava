public class switch1 {
    public static void main(String[] args) {
        // ternanry operator
      int x=121;
      int result=0;

      result = x%2==0 ? 10 : 20;
      System.out.println(result);



    //   switch (old version)

    int n =7;
    switch (n) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday"); 
            break;   
        case 3:
            System.out.println("Wednesday"); 
            break;
        case 4:
            System.out.println("Thursday"); 
            break;        
        case 5:
            System.out.println("Friday"); 
            break;
        case 6:
            System.out.println("Saturday"); 
            break;
        case 7:
            System.out.println("Sunday"); 
            break; 

        default:
        System.out.println("Enter a valid number");
            break;
    }




    // switch (new version)
    // you can use arrow key for new version instead of writing break in every case u can use arrow key to get reduction in code 
    // we can also use string value in case it wasnt available before java 15 but after java15 it is available


    String day ="Wednesday";

    switch (day) {

    case "Saturday","Sunday" -> System.out.println("8 AM");
    case "Monday" -> System.out.println("7 AM");
    default -> System.out.println("6 AM");

    }


    // if u want to use switch as an expression u can also do it 

    String days= "Wednesday";
    String results="";

    switch (days) {
        case "Monday" -> results ="6 AM";  // here u can even remove results= just give value and it will still gove the desired output u can check it by removing results= from every case and just check whether the desired output is coming or not just add yield instead of results ;like this  case "Sunday" -> yield "6 AM";
        case "Saturday","Sunday" -> results ="8 AM";
        default -> results = "7 AM";
    }
    System.out.println(results);
    


    
}
}
