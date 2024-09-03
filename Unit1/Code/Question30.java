// 30.	Static Inner Class:  
// ●	Write a Java program that includes a static inner class StaticInner within an outer class. Demonstrate how to create an instance of the static inner class from the main method.


class OuterClass
{
    static class InnerClass
    {
        public InnerClass(){
            System.out.println("Instance of InnerClass created");
        }
    }
}
public class Question30 {
    public static void main(String[] args) {
        OuterClass.InnerClass Ic1 = new OuterClass.InnerClass();
    }
    
}
