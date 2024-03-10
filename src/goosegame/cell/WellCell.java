package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents a well cell in the game, where a player may get trapped temporarily.
 * Extends the basic Cell class and includes additional properties for the player trapped in the well.
 */
public class WellCell extends Cell {
    /**
     * The player currently trapped in the well cell.
     */
    private Player trappedPlayer;

    /**
     * Constructs a new WellCell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public WellCell(int num) {
        super(num);
        this.trappedPlayer = null;
    }

    /**
     * Indicates whether the WellCell is a special cell.
     *
     * @return true, as WellCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }

    /**
     * Handles the rebounce behavior for players landing on the WellCell.
     * If the WellCell is unoccupied, the player becomes trapped in the well.
     * If the WellCell is already occupied, the previously trapped player is released, and the new player becomes trapped.
     *
     * @param player The player landing on the WellCell.
     */
    @Override
    public void rebounce(Player player) {
        if (trappedPlayer == null) {
            trappedPlayer = player;
            player.setCell(this);
        } else if (trappedPlayer != null) {
            trappedPlayer.setCell(player.getCell());
            trappedPlayer = player;
            player.setCell(this);
        }
    }

    /**
     * Checks if a specific player is currently trapped in the well.
     *
     * @param player The player to check for being trapped.
     * @return true if the player is trapped in the well, false otherwise.
     */
    public boolean isPlayerTrapped(Player player) {
        return trappedPlayer == player;
    }
}