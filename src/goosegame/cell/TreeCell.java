package goosegame.cell;

import goosegame.Cell;

/**
 * Represents a tree cell in the game, which may have specific effects on player movement.
 * Extends the basic Cell class.
 */
public class TreeCell extends Cell {

    /**
     * Constructs a new TreeCell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public TreeCell(int num){
        super(num);
    }

    /**
     * Indicates whether the TreeCell is a special cell.
     *
     * @return true, as TreeCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }
}
