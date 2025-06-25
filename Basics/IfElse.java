public class IfElse {
    public static void main(String[] args) {
        int x = 8;
        int y = 10;
        int z = 12;

        if(true){
        System.out.println("it is true");
        }
        //if(false)
        //System.out.println("its false");//doesn't print statement
        //System.out.println();
        if(x<y){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println();
        if(x>y)
            System.out.println("x is greater");
        else if(y>z)
            System.out.println("y is greater");
        else 
            System.out.println("z is greater");

    }
}
