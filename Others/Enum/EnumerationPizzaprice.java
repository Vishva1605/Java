package Others.Enum;
class Pizza{
    enum Size{
        SMALL(30),MEDIUM(60),LARGE(90);

        private int value;
        Size(int value){
            this.value = value;
        }
        int getValue(){
            return value;
        }
    }
}
public class EnumerationPizzaprice {
    public static void main(String[] args) {
        Pizza.Size pe = Pizza.Size.LARGE;
        if(pe == Pizza.Size.LARGE){
            System.out.println(pe+" Pizza of Rs."+pe.getValue());
        }else{
            System.out.println("pizza is not Large");
        }
    }
}
