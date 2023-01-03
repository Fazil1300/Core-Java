import java.util.Scanner;

public class groupswitchStatement {
    public static void main(String[] args) {
        System.out.print("Enter Character:");
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It's Vowel");
            
            default:
                System.out.println("It's Consonant");

        }
        in.close();
    }
}
//If you have same statement for multiple cases