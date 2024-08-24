// 17.	Overloading with Varargs:
// ●	Create a Java program that defines a method using varargs and another method with a fixed number of parameters. Show how both methods can be called from the main method.

public class Question17 {
    public static int Add(int ...arr)
    {
        int sum = 0;
        for(int i: arr)
            sum+= i;
        
        return sum;
    }
    public static int Add(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        int sum1 = Add(1,2,3,4,5,6,7);
        int sum2 = Add(10,20);

        System.out.println("The result obtained from variable parameter function is: "+sum1);
        System.out.println("The result obtained from fixed parameter function is: "+sum2);
    }
}
