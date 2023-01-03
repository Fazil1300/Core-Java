import java.util.Scanner;

//Nested Loop -> Loops having another loop
public class nestedforLoop {
    public static void main(String[] args) {
        int rows,columns;
        String symbol="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter No.of.Rows:");
        rows=in.nextInt();
        System.out.println("Enter No.of.Columns:");
        columns=in.nextInt();
        System.out.println("Enter Symbol:");
        symbol=in.next();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        in.close();
    }
}
