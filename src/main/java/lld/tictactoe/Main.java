package lld.tictactoe;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Batman", Symbol.X);
        Player p2 = new Player("Spiderman", Symbol.O);
        TicTacToeGame game = new TicTacToeGame(3, p1, p2);
        game.play();
    }
}
