package lld.tictactoe;

import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private Board board;
    private List<Player> players;
    private int currentPlayerIdx;
    private GameStatus status;

    public TicTacToeGame(int size, Player p1, Player p2) {
        this.board = new Board(size);
        this.players = List.of(p1, p2);
        this.status = GameStatus.IN_PROGRESS;
        this.currentPlayerIdx = 0;
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        while (status == GameStatus.IN_PROGRESS) {
            board.print();
            Player currentPlayer = players.get(currentPlayerIdx);
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and col:");
            int r = sc.nextInt(), c = sc.nextInt();

            Move move = currentPlayer.makeMove(board, r, c);
            if (!board.isValidMove(move) || !board.placeMove(move)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (board.isWinningMove(move)) {
                status = GameStatus.WIN;
                board.print();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                status = GameStatus.DRAW;
                board.print();
                System.out.println("Game Draw!");
                break;
            }

            currentPlayerIdx = (currentPlayerIdx + 1) % 2;
        }
    }
}
