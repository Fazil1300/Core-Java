/*Ternary/Conditional operators
        condition ? trueStatement : falseStatement*/ 
public class ternaryOperators {
    public static void main(String[] args) {
        int num1=10,num2=100;
        int c=num1>num2?num1:num2;
        System.out.println("Which one is biggest number?");
        System.out.println(num1+" OR "+num2);
        System.out.println(c+" is biggest number");
        
        System.out.println();
        int num3=150,num4=100;
        int d=num3>num4?num3:num4;
        System.out.println("Which one is biggest number?");
        System.out.println(num3+" OR "+num4);
        System.out.println(d+" is biggest number");
    }
}
