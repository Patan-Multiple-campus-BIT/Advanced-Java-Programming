// 28.	Multiple Interface Implementation:
// ●	Create a Java program with two interfaces: Shape and Color. Implement both interfaces in a class named ColoredCircle, providing appropriate implementations for the methods in each interface.

interface Shape
{
    void defineShape();
}
interface Color
{
    void defineColor();
}

class ColoredCircle implements Shape,Color
{
    public void defineShape()
    {
        System.out.println("The shape of a circle is circular.");
    }
    public void defineColor()
    {
        System.out.println("A circle can be filled with any color of your choice.");
    }
}
public class Question28
{
    public static void main(String[] args) {
        ColoredCircle cc = new ColoredCircle();
        cc.defineShape();
        cc.defineColor();
    }
}