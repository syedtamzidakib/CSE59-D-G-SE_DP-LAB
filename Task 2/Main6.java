class Applet{
void launch(){
    System.out.println("Applet launched");
}}
class Gameapplet extends Applet{
    
    void play(){
        System.out.println("Playing game");}
}
public class Main6 {
     public static void main(String[] args) {

        Gameapplet game = new Gameapplet();

        game.launch();  
        game.play();    
    }
    
}

