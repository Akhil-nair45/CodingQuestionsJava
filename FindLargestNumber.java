public class FindLargestNumber {
    public static void main(String []args){


        // for finding greatest number between two varibales
        // int a = 10;
        // int b=20;

        // if(a>b)
        // {
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }




        int a =20,b=34,c=4;

        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>c && b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}