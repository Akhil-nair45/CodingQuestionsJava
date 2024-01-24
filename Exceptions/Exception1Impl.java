package Exceptions;

public class Exception1Impl  {
    public void getOrderId(int orderId) throws Exception1{
        if(orderId==101)
        {
            throw new Exception1("The order not found "+orderId); // here on writing this line it will give u a error but as soon as u will throws exception in the method it will get solved
        }
        else{

        }
    }

    public static void main(String[] args) throws Exception1 {
        Exception1Impl e1= new Exception1Impl();
        e1.getOrderId(101);
    }
}
