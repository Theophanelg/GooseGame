package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents a dead cell in the goose game, where a player might face specific consequences.
 * Extends the basic Cell class.
 */
public class DeadCell extends Cell {

    /**
     * Constructs a new DeadCell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public DeadCell(int num) {
        super(num);
    }

    /**
     * Indicates whether the DeadCell is a special cell.
     *
     * @return true, as DeadCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }

    /**
     * Handles the rebounce behavior for players landing on a DeadCell.
     * Moves the player back to the starting cell (Cell 1).
     *
     * @param p The player landing on the DeadCell.
     */
    @Override
    public void rebounce(Player p) {
        p.setCell(new Cell(1));
    }
}