package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents the final cell in the game, where a player must reach to win.
 * Extends the basic Cell class.
 */
public class FinalCase extends Cell {

    /**
     * Constructs a new FinalCase with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public FinalCase(int num) {
        super(num);
    }

    /**
     * Handles the finishing behavior for players landing on the FinalCase.
     * Prints a message indicating the player's victory in the game.
     *
     * @param player The player who reached the FinalCase.
     */
    public void finishCase(Player player) {
        System.out.println(player.toString() + " wins the game");
    }

    /**
     * Indicates whether the FinalCase is a special cell.
     *
     * @return true, as FinalCase is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }

    /**
     * Handles the rebounce behavior for players landing on the FinalCase.
     * Moves the player to the appropriate cell based on the bounce.
     *
     * @param player The player landing on the FinalCase.
     */
    @Override
    public void rebounce(Player player) {
        int bounce = player.getCell().getNum() - num;
        player.setCell(player.getBoard().getCell(num - bounce));
    }
}