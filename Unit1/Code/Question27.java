// 27.	Basic Interface Implementation:
// ●	Write a Java program that defines an interface named Drawable with a method draw(). Implement this interface in a class Circle that provides its own implementation of the draw() method.

interface Drawable
{
    void draw();
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a circle with free hand is a bit challenging.");
    }
}
public class Question27 {
public static void main(String[] args) {
    Drawable shape = new Circle();
    shape.draw();
}    
}
