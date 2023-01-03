/*variable -> A container to store values
              It behaved as the value it contains
we can store different type of data
dataType varName=value
*/
public class variables {
    public static void main(String[] args) {
        String name="Md Fazil";
        char gender='M';
        int age=22;
        float cgpa=7.8f;
        boolean married=false;
        System.out.println("Name:"+name);//Here we concatenate String with name using +
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Cgpa:"+cgpa);
        System.out.println("Married:"+married);
    }
}
/*Before variable you have know about dataTypes 
dataTypes
        Primitive
        Non primitive/Reference
 Primitive -> byte,short,char,int,long,float,double,boolean
 Reference -> String,array
 
 PRIMITIVE
        8 types
        stores data
        can hold 1 value

REFERENCE
        Unlimited(User Defined)
        Stores an address
        Could hold more than 1 value

DATATYPE        SIZE        VALUE
    boolean     1 bit       true/false
    byte        1 byte      -128 to 127
    short       2 bytes     -32K to 32K
    int         4 bytes     -2B to 2B
    long        8 bytes     -9Q to 9Q
    float       4 bytes     fractional nuumber up to 6-7 digits
    double      8 bytes     fractional nuumber up to 15digits
    char        2 bytes     single character/letter/ASCII value 
    String      Varies      sequence of characters
*/