// ●	Design a Java program that includes a class named Calculator with methods for addition, subtraction, multiplication, and division. Create an object of this class and perform arithmetic operations.
class Calculator
{
    int Add(int a, int b)
    {
        return a+b;
    }
    int Substraction(int a, int b)
    {
        return a-b;
    }
    int Multiplication(int a, int b)
    {
        return a*b;
    }
    int Division(int a, int b)
    {
        return a/b;
    }

}
public class Question14 {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int a = 15, b= 5;
        System.out.format("The addition of %d and %d results to %d\n",a,b,calc.Add(a,b));
        System.out.format("The difference of %d and %d is %d\n",a,b,calc.Substraction(a,b));
        System.out.format("The product of %d and %d is %d\n",a,b,calc.Multiplication(a,b));
        System.out.format("The quotient when %d is divided by %d",a,b,calc.Division(a,b));
    }
}
