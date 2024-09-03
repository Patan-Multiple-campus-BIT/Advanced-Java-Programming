// 21.	Overloading with Inheritance: 
// ●	Create a base class and a derived class. Implement overloaded methods in both classes. Demonstrate how method overloading works when dealing with inheritance.

class Father
{
    public void GiveIntro()
    {
        System.out.println("Hello this is father");
    }
}
class Son extends Father{
    @Override
    public void GiveIntro()
    {
        System.out.println("Hello this is son");
    }
}
public class Question21 {
    public static void main(String[] args) {
        
    }    
}
