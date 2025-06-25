public class ArrayFindElement {
    public static void main(string[] args) {
        int num[] = {2,4,5,6,7};
        int n = 10;
        boolean found = false;
        for(int i=0;i<num.length;i++){
            if(num[i]==n){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
