package Question24.derive;
import Question24.base.BaseClass;
class Child extends BaseClass{
    public void CallProtected()
    {
        protectedMethod();
    }
}
public class Derived  {
    public static void main(String[] args) {
        Child bc = new Child();
        bc.CallProtected();
    }
}
