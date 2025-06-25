public class ArmStrong {
    public static void main(string[] args) {
        int n = 9474;
        int z=n;
        int e=n;
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        int fin=0;
        while(e!=0){
            int a=e%10;
            int m=1;
            int st=1;
            while(m<=count){
                st*=a;
                m++;
            }
            fin+=st;
            e/=10;
        }
        System.out.println(fin);

        if(fin==z){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
}
