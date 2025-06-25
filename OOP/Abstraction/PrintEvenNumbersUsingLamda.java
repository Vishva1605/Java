@FunctionalInterface
interface Number{
    void printEvenNumber();
}
public class PrintEvenNumbersUsingLamda {
    public static void main(String[] args) {
    Number n = () ->{
        int[] arr = {1,2,3,4,5,6,7,8,10};
        try{for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error in an Array");
        }
    };
    n.printEvenNumber();
}
}
