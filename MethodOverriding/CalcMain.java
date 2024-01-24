package MethodOverriding;

public class CalcMain {
    public static void main(String[] args) {
        AdvCalc ac= new AdvCalc();
        int add1 = ac.add(2, 2);  
        System.out.println(add1);

        // here we have two same method in the two different classes i.e; calc and advcalc we have ad method but the difference is advcalac which extends calc has +1 in the return so if we are creating the obj of advcalc and we are trying to call the add method it will first check whether there is a add method in it if yes it will override the add method else if not there it will check whether the parent class/ calc class has this method and then it ewill execute that method this is the overall iverview of mewthod overrriding
    }
    
}
