@FunctionalInterface
interface Addable{
    int add(int i,int j);
}
public class SumUsingLamda {
    public static void main(String[] args) {
        Addable a = (i,j) -> i/j;
        System.out.println(a.add(2,7));
    }
}
