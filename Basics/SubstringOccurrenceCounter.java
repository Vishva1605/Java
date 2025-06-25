//Count the number of occurrences of a substring in a string.
public class SubstringOccurrenceCounter {
    public static void main(string[] args) {
        String str = "The   sun was shining brightly as the children played in the park. The breeze was gentle, and the trees swayed calmly in the wind. Among the crowd, a boy was flying a kite while the others watched in amazement. The sound of laughter filled the air, and the joy was contagious. Even the birds seemed to sing along with the fun happening below. It was one of the happiest days the neighborhood had seen in a long time.";
        str = str.trim().toLowerCase();
        String substr = "the";
        int count = 0;
        String regrex = "[,\\.\\s]";//\\s+ is for avoidng any white spaces \t...&\\. used for split by any dots
        String[] arr = str.split(regrex);
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(substr)){
                count++;
            }
        }
        System.out.println("Count of a Subsitring : "+count);
    }
}
