import java.util.Scanner;

/*else if ladder -> we can add more if kindaa statements
*/
public class elseifStatement {
    public static void main(String[] args) {
        int age;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=in.nextInt();
        if(age>=70){
            System.out.println("You're Boomer");
        }
        else if(age>=18){
            System.out.println("You're Adult");
        }
        else if(age>=18){
            System.out.println("You're Teenager");
        }
        else{
            System.out.println("you're Child");
        }
        in.close();
    }
}
