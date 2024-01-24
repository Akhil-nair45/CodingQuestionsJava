package Inheritance;

public class CalcMain {
    public static void main(String[] args) {
        // AdvCalc ac = new AdvCalc();
        ScificCalc ac= new ScificCalc();
        int sum1 = ac.add(1, 1);
        int sum2 = ac.sub(5, 3);
        int sum3 = ac.multi(1, 2);
        int sum4 = ac.div(4, 2);
        double sum5 = ac.power(2,3);
        
        System.out.println("Addition sum answer :"+sum1+" , "+ "Substraction sum answer :"+sum2+" , "+ "Multiplication sum answer :"+sum3+" , "+"Division sum answer :"+sum4+" ,"+"power sum answer :"+sum5);
    }
}
