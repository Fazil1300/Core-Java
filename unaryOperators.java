/*Unary Operators
    ++      ->  Pre Incrment , Post Increment
    --      ->  Pre Decremnt , Post Decrement
*/
public class unaryOperators {
    public static void main(String[] args) {
        int a=1,b=10;
        System.out.println("a:"+a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println();
        System.out.println("b:"+b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
/*NOTES
    --a,--b -> First Increases/Decreases values and then print
    a++,b++ -> First print the values and then Increases/Decreases the values
    Program follow up -> botton and left to right approach
 */