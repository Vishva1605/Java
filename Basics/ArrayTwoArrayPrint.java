//normal printing 
public class ArrayTwoArrayPrint {
    public static void main(string[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,0};
        int n1 = arr1.length;
        //int n2 = arr2.length;

       // int num[] = new int [n1 + n2];
        for(int i=0;i<n1;i++){
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
        }
    }
}
