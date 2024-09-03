// 41.	Simple Custom Exception:
// Question: Create a custom exception class named CustomException that extends the Exception class. Implement a simple constructor that takes a message as a parameter. In your main program, throw an instance of this custom exception and catch it in a catch block.

class CustomException extends Exception
{
    public CustomException(String message)
    {
        System.out.println(message);
    }
}
public class Question41 {
    public static void main(String[] args)
    {
        try
        {
            throw new CustomException("Custom excetpion called");
        }
        catch(Exception e)
        {
            System.out.println("Cusotm excpetion catched");
        }
    }
}
