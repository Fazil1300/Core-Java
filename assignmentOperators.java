/*Assignment Operators
 *  =       a=123       a=123
 *  +=      a+=10       a=123+10
 *  -=      a-=10       a=123-10
 *  *=      a*=10       a=123*10
 *  /=      a/=10       a=123/10
 *  %=      a%=10       a=123%10
 */
public class assignmentOperators {
    public static void main(String[] args) {
        int a=123;
        System.out.println("a="+a);
        System.out.println(a+=10);
        System.out.println(a-=10);
        System.out.println(a*=10);
        System.out.println(a/=10);
        System.out.println(a%=10);
    }
}
