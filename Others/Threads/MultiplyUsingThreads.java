package Others.Threads;
import java.util.Scanner;
class Table{
    public void printTable(int num)throws InterruptedException{
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+num+" = "+(i*num));
            Thread.sleep(300);
        }
        System.out.println("----------------------------");
    }
}
class Multiply extends Thread{
    private Table table;
    private int num;
    Multiply(Table table,int num){
        this.table = table;
        this.num = num;
    }
    public void run(){
        try {
            table.printTable(num);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class MultiplyUsingThreads{
    public static void main(String[] args)throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Tables You Want : ");
        int ans = sc.nextInt(),j=0;
        int[] nums = new int[ans];
        Table t = new Table();
        for(int i=1;i<=ans;i++){
            System.out.print(i+". Enter the Table Number : ");
            nums[j++] = sc.nextInt();
        }
        for(int num : nums){
            System.out.println("Table : "+num);
            Multiply m = new Multiply(t, num);
            m.start();
            m.join();
        }
        sc.close();
    }
}
