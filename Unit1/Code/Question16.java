// 16.	Basic Overloading:
// ●	Write a Java program with a class that has two methods with the same name but different parameter types (e.g., one with an int parameter and another with a double parameter). Demonstrate calling both methods.
class MyClass
{
    public void doubleNumber(int a)
    {
        System.out.println("The double of "+a+" is "+(2*a));
    }
    public void doubleNumber(double a)
    {
        System.out.println("The double of "+a+" is "+(2*a));
    }
}
public class Question16 {
    public static void main(String[] args) {
        MyClass monster = new MyClass();
        monster.doubleNumber(10);
        monster.doubleNumber(10.5);
    }
}
