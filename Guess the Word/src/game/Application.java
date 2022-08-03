package game;

public class Application {

    public static void main(String[]args){

        GuessTheWord game = new GuessTheWord();
        game.start();
        System.out.println("This game has started.");
        game.end();
        System.out.println("The game has ended");

    }
}
