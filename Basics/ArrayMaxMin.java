class Calculator{
    public void maximum(int array[]){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum : "+max);
    }
    public void minimum(int array[]){
        int min = array[0];
        for(int i=0;i<array.length;i++){
        if(min>array[i]){
            min = array[i];
        }
        }
        System.out.println("Minimum : "+min);
    }
}
public class ArrayMaxMin {
    public static void main(string[] args) {
        int array[] = {4,3,7,8,1};
        Calculator calc = new Calculator();
        calc.maximum(array);
        calc.minimum(array);
    }   
}
