package Others.Threads;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Typing extends Thread{
    private String sentence;
    private int milli;
    Typing(String sentence,int milli){
        this.sentence = sentence;
        this.milli = milli;
    }
    public void run(){
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            System.out.print(ch);
            try{Thread.sleep(milli);}catch(InterruptedException e){System.out.println("Error");}
        }
    }
}
public class TypingAnimationStimulation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter the Sentence : ");
            String sentence = br.readLine();
            System.out.print("Enter the delay(in milliseconds) : ");
            int milli = Integer.parseInt(br.readLine());
            Typing t1 = new Typing(sentence,milli);
            t1.start();
        }catch(Exception e){
            System.out.println("Error Occured.");
        }finally{
            br.close();
        }
        
    }
}
