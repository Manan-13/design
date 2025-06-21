package lld.tictactoe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private int row;
    private int col;
    private Symbol value;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.value = Symbol.EMPTY;
    }

    public boolean isEmpty() {
        return this.value == Symbol.EMPTY;
    }
}
