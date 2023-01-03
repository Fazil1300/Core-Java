public class commandLine {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
/*We can pass the values after the compilation
    CMD -> javac commandLine.java
        -> java commandLine hello people what's up
    
    OUTPUT will be
        hello
        people
        what's up
Here we passing the values as parameter to the variable called args        
*/