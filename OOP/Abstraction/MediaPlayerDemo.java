interface AudioPlayer{
    String playAudio();
}
interface MediaPlayer{
    String playVideo();
}
class SmartDevice implements AudioPlayer,MediaPlayer{
    public String playAudio(){return "Playing Audio...";}
    public String playVideo(){return "Playing Video...";}
}
public class MediaPlayerDemo {
    public static void main(String[] args) {
        SmartDevice s = new SmartDevice();
        System.out.println(s.playAudio());
        System.out.println(s.playVideo());
    }
}
