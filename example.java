public class example {
    int i1;   // global/ instance 
    
    public void numner()
    {
        int i;  //local 
        // System.out.println(i);


        System.out.println(i1);
    }

    public static void main(String[] args) {
        example e = new example();
        e.numner();
        System.out.println(e);
    }
}
