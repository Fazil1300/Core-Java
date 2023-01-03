//if statement -> Performs a block of code if the condition is true
import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        int age;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Age:");
        age=in.nextInt();
        if(age>=18){
            System.out.println("You're elgible for voting");
        }

        in.close();
    }
}
