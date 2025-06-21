package lld.tictactoe;

public class Board {

    private int size;
    private Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = new Cell(i, j);
    }

    public boolean placeMove(Move move) {
        Cell cell = grid[move.getRow()][move.getCol()];
        if (!cell.isEmpty()) return false;
        cell.setValue(move.getPlayer().getSymbol());
        return true;
    }

    public boolean isValidMove(Move move){
        if(move.getRow() < 0 || move.getCol() < 0 || move.getRow() >= size || move.getCol() >= size) return false;
        else return true;
    }

    public boolean isWinningMove(Move move) {
        int row = move.getRow();
        int col = move.getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // Check row
        boolean winRow = true;
        for (int j = 0; j < size; j++) {
            if (grid[row][j].getValue() != symbol) {
                winRow = false;
                break;
            }
        }
        if(winRow) return true;

        // Check column
        boolean winCol = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][col].getValue() != symbol) {
                winCol = false;
                break;
            }
        }
        if(winCol) return true;

        // Check main diagonal
        boolean winDiag = true;
        if (row == col) {
            for (int i = 0; i < size; i++) {
                if (grid[i][i].getValue() != symbol) {
                    winDiag = false;
                    break;
                }
            }
        } else {
            winDiag = false;
        }
        if(winDiag) return true;

        boolean winAntiDiag = true;
        if (row + col == size - 1) {
            for (int i = 0; i < size; i++) {
                if (grid[i][size - i - 1].getValue() != symbol) {
                    winAntiDiag = false;
                    break;
                }
            }
        } else {
            winAntiDiag = false;
        }
        if(winAntiDiag) return true;

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(grid[i][j].isEmpty()) return false;
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Symbol value = grid[i][j].getValue();
                if (value == Symbol.EMPTY) {
                    System.out.print("- ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}
