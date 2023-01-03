//breakcontinueStatment

public class breakcontinueStatment {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            else if(i==8){
                break;
            }
            System.out.println(i);
        }
    } 
}
//Continue -> When we do not want to execute some statements then we can use continue statement,it will start the  next Iteration
//Break -> If we want to go out of a loop then we can use break statement,it will stop execution and it will continue with the next statement outisde the loop