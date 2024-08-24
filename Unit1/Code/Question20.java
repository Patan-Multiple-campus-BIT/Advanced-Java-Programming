// 20.	Overloading Static Methods:
// ●	Develop a Java class with two static methods that have the same name but different parameters. Show how to call these methods without creating an instance of the class.

public class Question20 {
    public static int Add(int a, int b)
    {
        return a+b;
    }
    public static String Add(String a, String b)
    {
        return a+" "+b;
    }
public static void main(String[] args) {
    int result = Add(5,10);
    String fullName = Add("Keshab", "Aryal");
    System.out.println("The sum of 5 and 10 is "+result);
    System.out.println("My name is: "+fullName);
}    
}
