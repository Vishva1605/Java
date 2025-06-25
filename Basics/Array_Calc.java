class Calculator{
    double sum = 0;

    public void sum(int num[]){
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println("Total : "+ sum);
    }

    public void average(int num[]){
        double average = sum/num.length;
        System.out.println("Average : "+average);
    }
}
public class Array_Calc {
    public static void main(String[] args) {
        int num[] = {3,4,5,6};
        Calculator arr1 = new Calculator();
        arr1.sum(num);
        arr1.average(num);
    }
}
