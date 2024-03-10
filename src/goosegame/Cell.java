package goosegame;

/**
 * Represents a basic cell on the game board in the goose game.
 * Each cell has a position (number) on the board and may or may not be occupied by a player.
 * This class serves as the base class for different types of cells in the game.
 */
public class Cell {
    /**
     * The position (number) of the cell on the board.
     */
    protected int num;

    /**
     * The player occupying the cell. It can be null if the cell is unoccupied.
     */
    protected Player player;

    /** 
     * Constructs a new Cell with the specified cell number.
     *
     * @param num The number representing the position of the cell on the board.
     */
    public Cell(int num) {
        this.num = num;
    }

    /**
     * Gets the number representing the position of the cell on the board.
     *
     * @return The cell number.
     */
    public int getNum() {
        return this.num;
    }

    /**
     * Gets the player
     * @return The player
     */
    public Player getPlayer(){
        return player;
    }

    /**
     * Sets a player on the cell.
     *
     * @param player The player to set on the cell.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Indicates whether the cell is special. By default, cells are not special.
     *
     * @return false, as the Cell class represents a basic, non-special cell.
     */
    public boolean isSpecial() {
        return false;
    }

    /**
     * Handles the rebounce behavior for players landing on the cell.
     * This method is meant to be overridden by subclasses for specific rebounce behaviors.
     *
     * @param player The player landing on the cell.
     */
    public void rebounce(Player player) {
        // Default implementation does nothing.
    }
}