//if statement -> Performs a block of code if the condition is true or
//else statement ->Executes vlock of code if statement wasn't true
import java.util.Scanner;

public class ifelseStatement {
    public static void main(String[] args) {
        int year;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Year:");
        year=in.nextInt();
        if((year%4==0)||(year%100==00 && year%400==100)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        in.close();
    }
}
