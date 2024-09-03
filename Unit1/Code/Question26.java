// 26.	Access Modifiers in Constructors:
// ●	Develop a Java program with a class that has a private constructor. Show how this class can be instantiated within the same class using a public method.

public class Question26 {
    private Question26()
    {
        System.out.println("Private constructor of the class invoked");
    }
    public static void main(String[] args) {
        Question26 q26 = new Question26();
    
    }
}
