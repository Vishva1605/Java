abstract class OnClickListener{
    abstract void onClick();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        OnClickListener o1 = new OnClickListener() {
            void onClick(){
                System.out.println("Button clicked");
            }
        };
        o1.onClick();
    }
}
