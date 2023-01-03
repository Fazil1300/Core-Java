//switch -> statement that allows a variable to be tested for equality against a list of values
import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        System.out.println("Two Number Calculator");
        System.out.println("1 Addition\n2 Subtraction\n3 Multiplication\n4 Division");
        System.out.print("Enter Your Choice:");
        int choice;
        Scanner in=new Scanner(System.in);
        choice=in.nextInt();
        int a,b;
        switch(choice){
            case 1:
                System.out.print("Enter a:");
                a=in.nextInt();
                System.out.print("Enter b:");
                b=in.nextInt();
                System.out.println("Addition:"+(a+b));
                break;
            case 2:
                System.out.print("Enter a:");
                a=in.nextInt();
                System.out.print("Enter b:");
                b=in.nextInt();
                System.out.println("Subtraction:"+(a-b));
                break;
            case 3:
                System.out.print("Enter a:");
                a=in.nextInt();
                System.out.print("Enter b:");
                b=in.nextInt();
                System.out.println("Multiplication:"+(a*b));
                break;
            case 4:
                System.out.print("Enter a:");
                a=in.nextInt();
                System.out.print("Enter b:");
                b=in.nextInt();
                System.out.println("Division:"+(a/b));
                break;
            default:
                System.out.print("Invalid Input");

        }
        in.close();
    }
}
/*NOTES
    Always use BREAK statement when the corresponding case is finished,Otherwise it started all along the other case(s) untill break comes
    DEFAULT statement executed when the choice have not find any cases  
 */