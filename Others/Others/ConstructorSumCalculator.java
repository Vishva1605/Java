package Others.Others;
//Create a constructor that sets the value of two numbers and a method to print their sum.
class ConstructorSumCalculator {
    int a,b;
    ConstructorSumCalculator(int n1,int n2){
        a = n1;
        b = n2;
        }
        void add(){
        System.out.println("Sum : "+(a+b));
        }
    public static void main(String[] args) {
        ConstructorSumCalculator sum = new ConstructorSumCalculator(4,5);
        sum.add();

    }
}
