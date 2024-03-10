package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/**
 * Represents a goose cell in the goose game, where a player may experience special movement.
 * Extends the basic Cell class.
 */
public class GooseCell extends Cell {

    /**
     * Constructs a new GooseCell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public GooseCell(int num) {
        super(num);
    }

    /**
     * Performs a "rebond" for the player landing on the GooseCell.
     * If the player is enabled to play, they move twice the distance of their previous roll.
     * Prints a message indicating the rebond action.
     *
     * @param p The player landing on the GooseCell.
     */
    public void Rebond(Player p) {
        if (p.isEnableToPlay()) {
            p.move();
            System.out.println(p.toString() + " does a rebond on " + this.getNum());
        }
    }

    /**
     * Indicates whether the GooseCell is a special cell.
     *
     * @return true, as GooseCell is a special cell.
     */
    @Override
    public boolean isSpecial() {
        return true;
    }
}