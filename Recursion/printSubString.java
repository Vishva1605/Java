public class printSubString {
    public static void printSubsets(String str, String curr, int index) { 
        if(str.length()==0) System.out.println("Empty String");
        // char[] ch = str.toCharArray();
        if(index<str.length()){
            for(int j=index+1;j<str.length();j++){
                curr = str.charAt(index) +""+ str.charAt(j);
                printSubsets(str,curr,index+1);
                System.out.print(curr + " ");
            }
        }
    }
    public static void main(String[] args){
        String str = "abc";
        String curr = str;
        int index = 0;
        printSubsets(str, curr, index);
    }
}
