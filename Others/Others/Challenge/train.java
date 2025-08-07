//which train epo vanthuchi ? entha platform ?
//which train epo pochi ? entha platform ?
//how many platforms are gaali ?
//how many platform are filled ?

public class train {
    public static void main(String[] args){
        double[] entry = {10.00,10.10,10.15};
        double[] exit = {10.10,10.35,10.25};
        int platform = entry.length;
        double lasttrain = entry[entry.length-1];

        for(int i=0;i<entry.length;i++){
            if(entry[i]<lasttrain){
                System.out.printf("Train Number : %d is arrived on the Platform %d at : %.2f\n",(i+1),(i+1),entry[i]);
            }
        }

        for(int i=0;i<exit.length;i++){
            if(exit[i]<lasttrain){
                System.out.printf("Train Number : %d is left from the Platform %d at : %.2f\n",(i+1),(i+1),exit[i]);
                platform--;
            }
        }
        
        System.out.println("Number of trains are left from the platform on arrival of 3rd train : "+(exit.length-platform));
        System.out.println("Number of train in the Platform in the arrival of 3rd Train : "+platform);
    }
}
