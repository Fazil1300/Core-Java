//while loop -> Executes a block of code as long as it's condition is true
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name="";
        while(name.isBlank()){
           System.out.print("Enter Your Name:");
           name=in.nextLine();
        }
        System.out.println("Hello "+name);
        in.close();
    }
}
/*NOTES
    We have while & doWhile loop
        doWhile ->Exit Check
                  It executes a block of code atleast once  
        while   ->Entry Check  
 */