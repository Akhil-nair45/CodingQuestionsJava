public class EXAMPLE1 {
    int a =10;
    public int hello(){
        System.out.println("i am here to check whether the constructrs are static or not ");
        return a;
        
    }

    public static void main(String[] args) {
        EXAMPLE1 ex2 = new EXAMPLE1();
        ex2.hello();
        System.out.println(ex2.hello());
    }
}
