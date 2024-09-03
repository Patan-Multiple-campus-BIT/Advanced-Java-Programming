// 31.	The provided Java program, FinalExample, showcases various uses of the final keyword. The finalVariable is initialized with the value 42, serving as an immutable constant. The finalMethod is marked as final, emphasizing its unmodifiable nature, preventing overrides in subclasses. The FinalClass is declared as final, indicating its unextendable nature. The displayValues method utilizes final parameters x and message, illustrating the prohibition of modifications within the method. In the main method, the program accesses the final variable, calls the final method, creates an instance of the final class, and demonstrates the use of the displayValues method with final parameters, providing a comprehensive exploration of the final keyword in Java.
package Question31;
final class FinalClass
{
    final int finalVariable = 42;
    final void finalMethod()
    {
        System.out.println("This is final method in final class");
    }
    void displayValues(final int x,final String message)
    {
        System.out.println("Value of x: " + x);
        System.out.println("Message: " + message);
    } 
}
public class FinalExample {
    public static void main(String[] args)
    {
        FinalClass obj = new FinalClass();
        System.out.println("Final variable: "+obj.finalVariable);

        obj.finalMethod();
        obj.displayValues(100,"This is a final parameter example");
        
    }
}