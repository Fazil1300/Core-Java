/*Type casting -> Changing one type of data into another type
Type Casting ->Widening,Narrowing
*/
public class typeCasting {
    public static void main(String[] args) {
        int a=10;
        double b=a;
        System.out.println("Widening");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        System.out.println();

        double c=95.838363;
        int d=(int)c;
        System.out.println("Narrowing");
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }
}
/*Widening byte -> short -> char -> int -> long -> float -> double
 *Narrowing double -> float -> long -> int => char -> short -> byte|When narrowing loss of data occur
 */