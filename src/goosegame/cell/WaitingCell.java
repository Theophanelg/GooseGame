package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents a waiting cell in the game, where a player may have to wait for a certain number of turns.
 * Extends the basic Cell class and includes additional properties for the remaining turns a player must wait.
 */
public class WaitingCell extends Cell {
    /**
     * The number of remaining turns a player must wait in the waiting cell.
     */
    private int remainingTurns;

    /**
     * Constructs a new WaitingCell with the specified cell number and remaining turns to wait.
     *
     * @param num             The number representing the position of the cell on the board.
     * @param remainingTurns The number of turns the player must wait before continuing their move.
     */
    public WaitingCell(int num, int remainingTurns) {
        super(num);
        this.remainingTurns = remainingTurns;
    }

    /**
     * Indicates whether the WaitingCell is a special cell.
     *
     * @return true, as WaitingCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }

    /**
     * Handles the rebounce behavior for players landing on the WaitingCell.
     * If there are remaining turns to wait, decrement the count of remaining turns.
     *
     * @param player The player landing on the WaitingCell.
     */
    @Override
    public void rebounce(Player player) {
        if (remainingTurns > 0) {
            remainingTurns--;
        }
    }
}