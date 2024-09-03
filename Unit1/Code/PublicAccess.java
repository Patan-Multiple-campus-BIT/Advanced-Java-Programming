package Question25;
public class PublicAccess {
    public static void main(String[] args) {
        DefaultAccessModifier dam = new DefaultAccessModifier();
        System.out.println("Calling default method of the DefaultAccessModifier Class");
        dam.giveIntro();
    }
}
