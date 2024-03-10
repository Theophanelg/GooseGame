package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents a trap cell in the game, where a player may get trapped temporarily.
 * Extends the basic Cell class and includes additional properties for the trapped player and a potential new cell.
 */
public class TrapCell extends Cell {
    /**
     * The player currently trapped in the trap cell.
     */
    private Player trappedPlayer;

    /**
     * The potential new cell to which the trapped player might move after escaping the trap.
     */
    private Cell newCell;

    // Add any additional implementation details or overrides as needed.

    /**
     * Constructs a new TrapCell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public TrapCell(int num) {
        super(num);
        this.trappedPlayer = null;
    }

    /**
     * Indicates whether the TrapCell is a special cell.
     *
     * @return true, as TrapCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }

    /**
     * Handles the rebounce behavior for players landing on the TrapCell.
     * If the TrapCell is unoccupied, the player becomes trapped on the cell.
     * If the TrapCell is already occupied, the trapped player is released to a specified new cell.
     *
     * @param player The player landing on the TrapCell.
     */
    @Override
    public void rebounce(Player player) {
        if (trappedPlayer == null) {
            trappedPlayer = player;
            player.setCell(this);
        } else if (trappedPlayer != null) {
            trappedPlayer.setCell(newCell);
            trappedPlayer = null;
        }
    }

    /**
     * Checks if a specific player is currently trapped on the TrapCell.
     *
     * @param player The player to check for being trapped.
     * @return true if the player is trapped on the TrapCell, false otherwise.
     */
    public boolean isPlayerTrapped(Player player) {
        return trappedPlayer == player;
    }

    /**
     * Sets the new cell where a trapped player will be moved upon release.
     *
     * @param newCell The new cell for the released player.
     */
    public void setNewCell(Cell newCell) {
        this.newCell = newCell;
    }
}