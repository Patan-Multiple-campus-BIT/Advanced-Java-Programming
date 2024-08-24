// 29.	Interface Inheritance:
// ●	Design a Java program that includes a base interface Vehicle with a method start(). Create a derived interface Car that extends Vehicle and adds a method accelerate(). Implement both interfaces in a class named SportsCar.
interface Vehicle
{
    void start();
}
interface MyCar extends Vehicle
{
    void accelerate();
}
class SportsCar implements MyCar
{
    public void start()
    {
        System.out.println("Car is getting started");
    }
    public void accelerate()
    {
        System.out.println("Car is speeding up");
    }
}
public class Question29 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.accelerate();
    }
}
