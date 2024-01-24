 class parent {
    public static void m1()
    {
        System.out.println("parent static m1");
    }


}

public class override extends parent{

     static int a =10;
    

    public static void m1()
    {
        System.out.println("child static m1");
    }


    public static void main(String[] args)
    {

        String strpassword= "unknoiwn";
        char[] charpassowrd= new char[]{'u','n','k','n','o','w','n'};
        System.out.println("String password:"+strpassword);
        System.out.println("Char password:"+charpassowrd);
        override o = new override();
        o.m1();
        // o.a=254;
        System.out.println(a=17);
    }
}
