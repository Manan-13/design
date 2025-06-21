package lld.tictactoe;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Player {

    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Move makeMove(Board board, int row, int col) {
        return new Move(this, row, col);
    }

    public Symbol getSymbol() { return symbol; }
}
