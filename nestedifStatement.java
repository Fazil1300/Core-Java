import java.util.Scanner;

/*Nested if Statement
A company insures its drivers in the following cases:
    a.If the driver is married.
    b.If the driver is unmarried, male & above 30 years of age.
    c.If the driver is unmarried, female & above 25 years of age. 
*/
public class nestedifStatement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Marital Status M/U:");
        char Marital=in.next().charAt(0);
        System.out.println("Enter Gender M/F:");
        char Gender=in.next().charAt(0);
        System.out.println("Enter Age:");
        int age=in.nextInt();
        if(Marital=='u' || Marital=='U'){
            if((Gender=='m'||Gender=='M') && (age>=30)){
               System.out.println("You're elgible for insurance");
            }
            else if((Gender=='f'||Gender=='F') && (age>=25)){
                System.out.println("You're elgible for insurance");
            }
            else{
                System.out.println("you're not elgible for insurance");
            }
        }
        else if(Marital=='m' ||Marital=='M'){
            System.out.println("You're elgible for insurance");
        }
        else{
            System.out.println("Invalid Input");
        }
        in.close();
    }
}
