package UpcastingDowncasting;

class A{
    public void show()
    {
        System.out.println("in show A");
    }
}

class B extends A{
    public void show1()
    {
        System.out.println("in show B");
    }
}



public class upCastDowncast {
    public static void main(String[] args) {
        B a = new A();  //typecasting
        a.show();
        a.show1();
    }
}
