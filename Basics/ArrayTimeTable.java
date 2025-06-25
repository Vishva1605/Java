public class ArrayTimeTable {
    public static void main(string[] args) {
    String array[][][] = {{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}},{{"Tam"},{"Eng"},{"Mat"},{"Sci"},{"Soc"},{"PT"},{"Yoga"},{"karate"}}};
    //String array[][][] = {{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}},{{"Tam","Eng","Mat","Sci","Soc","PT","Yoga","karate"}}};
    for(int i=0;i<array.length;i++){
        System.out.print("Day "+i+" : ");
        for(int j=0;j<array[i].length;j++){
            for(int k=0;k<array[i][j].length;k++){
                System.out.print(array[i][j][k]+" ");
            }
        }
        System.out.println();
    }
}
}