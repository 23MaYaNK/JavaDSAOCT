//to convert source code into byte code we have a command javac<sourceFileName.java>
//To convert byte code into machine code we have command java<ByteCodeFileName>
public class firstdemo
{
public static void main(String[] args) {
    System.out.println("this is the main that JRE knows");
    
}
public static void main()

{
    System.out.println("this main that JRE doesn't know");
}
}