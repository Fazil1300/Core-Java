/*Logical Operator
 *      AND     &&      returns true if both given expressions are true,else returns false
 *      OR      ||      returns true either one of the expressions are true
 *      NOT     !       reverses the value of condition
 */
public class logicalOperators {
    public static void main(String[] args) {
        int mark1=65 ,mark2=55;
        System.out.println("Mark 1:"+mark1+"\nMark 2:"+mark2);
        System.out.println("AND &&:"+(mark1>=35 && mark2>=35));
        System.out.println();
        mark1=25;
        mark2=55;
        System.out.println("Mark 1:"+mark1+"\nMark 2:"+mark2);
        System.out.println("OR ||:"+(mark1>=35 || mark2>=35));
        System.out.println("PERFORMING NOT !:"+!(mark1>=35 || mark2>=35));
    }
}
