
public class NoMatchingException {

public static void main(String[] args) {
try {
System.out.println("Print 1");
System.out.println(10 / 0);
System.out.println("Print 2");
} catch (ArithmeticException e) { //ArithmeticException
System.out.println("Cannot divide by zero");
} finally {
System.out.println("What is wrong with this code?");
}
}

}