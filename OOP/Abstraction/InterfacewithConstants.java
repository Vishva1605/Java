interface GameRules{
    int Max_Players = 4;
    String startGame();
}
class Chess implements GameRules{
    public String startGame(){return "Starting Chess Game with Max "+Max_Players+" Players.";}
}
public class InterfacewithConstants {
    public static void main(String[] args) {
        GameRules g1 = new Chess();
        System.out.println(g1.startGame());
    }
}
