package goosegame;

import java.util.Random;

/**
 * Represents a player in the goose game.
 */
public class Player {
    /**
     * A Random object for simulating dice throws.
     */
    private static Random random = new Random();

    /**
     * The current cell that the player occupies on the game board.
     */
    protected Cell cell;

    /**
     * The current cell number that the player occupies on the game board.
     */
    protected int numCell;

    /**
     * The name of the player.
     */
    protected String name;

    /**
     * A flag indicating whether the player is able to play. Defaults to true.
     */
    private boolean enableToPlay = true;

    /**
     * The game board on which the player plays.
     */
    private Board board;

    /**
     * Constructs a new Player with the specified name and game board.
     *
     * @param name  The name of the player.
     * @param board The game board on which the player plays.
     */
    public Player(String name, Board board) {
        this.name = name;
        this.cell = board.getCell(0);
        this.board = board;
        this.numCell = numCell;
    }

    /**
     * Gets a string representation of the player.
     *
     * @return The name of the player.
     */
    public String toString() {
        return this.name;
    }

    /**
     * Gets the current cell that the player occupies on the game board.
     *
     * @return The current cell of the player.
     */
    public Cell getCell() {
        return this.cell;
    }

    /**
     * Gets the current cell number that the player occupies on the game board.
     *
     * @return The current cell number of the player.
     */
    public int getNumCell() {
        return this.numCell;
    }

    /**
     * Gets the game board on which the player plays.
     *
     * @return The game board.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Sets the player's current cell to a new cell.
     *
     * @param newCell The new cell for the player.
     */
    public void setCell(Cell newCell) {
        this.cell = newCell;
    }

    /**
     * Simulates throwing two dice and returns the sum of the results.
     *
     * @return The sum of two dice throws.
     */
    private int oneDieThrow() {
        return Player.random.nextInt(6) + 1;
    }

    /**
     * Throws two dice and returns the sum of the results.
     *
     * @return The sum of two dice throws.
     */
    public int twoDiceThrow() {
        int result = oneDieThrow() + oneDieThrow();
        return result;
    }

    /**
     * Checks if the player is able to play.
     *
     * @return true if the player is able to play, false otherwise.
     */
    public boolean isEnableToPlay() {
        return enableToPlay;
    }

    // TODO A REVOIR
    /**
     * Moves the player on the game board based on the result of a two-dice throw.
     * Handles rebouncing if the new position exceeds the number of cells on the
     * board.
     */
    public void move() {
        if (enableToPlay) {
            int result = twoDiceThrow();
            int newPosition = cell.getNum() + result;
            if (newPosition > board.getNbCells()) {
                cell.rebounce(this);
            } else {
                Cell newCell = board.getCell(newPosition);
                if (newCell != null) {
                    setCell(newCell);
                } else {
                    System.out.println("Invalid move. Cell not found.");
                }
            }
        }
    }
}
