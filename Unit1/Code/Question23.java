// 23.	Private Access Modifier:
// ●	Create a Java program that uses a private variable and a private method within a class. Attempt to access these private members from outside the class and observe the results.

class Kaley
{
    private int myAge=23;
    private void myIntro()
    {
        System.out.println("Hello Keshab here.");
    }
}
@suppressWaring
public class Question23 {
    public static void main(String[] args) {
        Kaley keshab = new Kaley();
        System.out.println("My age is: ",keshab.myAge);
        keshab.myIntro();
    }    
}
