public class Merge_Sort {
    public static void main(string[] args) {
        //creating array
        int arr1[] = {1,3,4,5,6};
        int arr2[] = {2,7,9,8,0};
        //get array length
        int n1 = arr1.length;
        int n2 = arr2.length;
        //creating mearge array
        int num[] = new int[n1+n2];
        //assigning
        int i=0,j=0,k=0;
        //looping
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                num[k++]=arr1[i++];
                //i++;
                //k++;
            }else{
                num[k++]=arr2[j++];
                //j++;
                //k++;
            }
        }
        while(i<n1){
            num[k++] = arr1[i++];
        }
        while(j<n2){
            num[k++] = arr2[j++];
        }
        for(int val : num){
        System.out.println(val);
        }
    }
}
//works for two arrays . each array elemnts can be shuffled but in asscending order