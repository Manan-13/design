package lld.tictactoe;

import lombok.Getter;

@Getter
public class Move {
    private Player player;
    private int row, col;

    public Move(Player player, int row, int col) {
        this.player = player;
        this.row = row;
        this.col = col;
    }

    // getters
}

