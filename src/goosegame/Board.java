package goosegame;

import java.util.List;

/**
 * Represents the game board in the goose game.
 * This is an abstract class that serves as a blueprint for specific board
 * implementations.
 * It defines the common structure and behavior of game boards, including the
 * total number of cells,
 * an array of cells, and methods for initializing the board.
 */
public abstract class Board {
    /**
     * The total number of cells on the board.
     */
    protected final int nbOfCells = 63;

    /**
     * An array representing the cells on the board.
     */
    protected Cell[] theCells;

    /**
     * Represents a list of positions for Goose cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of GooseCell.
     */
    protected List<Integer> GooseCell;

    /**
     * Represents a list of positions for Dead cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of DeadCell.
     */
    protected List<Integer> DeadCell;

    /**
     * Represents a list of positions for FinalCase cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of FinalCase.
     */
    protected List<Integer> FinalCase;

    /**
     * Represents a list of positions for Trap cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of TrapCell.
     */
    protected List<Integer> TrapCell;

    /**
     * Represents a list of positions for Tree cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of TreeCell.
     */
    protected List<Integer> TreeCell;

    /**
     * Represents a list of positions for Waiting cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of WaitingCell.
     */
    protected List<Integer> WaitingCell;

    /**
     * Represents a list of positions for Well cells on the game board.
     * These positions are used during the initialization of the game board to
     * create instances of WellCell.
     */
    protected List<Integer> WellCell;

    /**
     * Constructs a new Board with the specified number of cells.
     *
     * @param nbOfCells The number of cells on the board.
     */
    public Board(int nbOfCells) {
        this.theCells = new Cell[nbOfCells];
    }

    /**
     * Initializes the board by creating instances of the Cell class for each cell.
     * This method is meant to be implemented by subclasses to customize the board
     * initialization.
     */
    protected abstract void initBoard();

    /**
     * Gets the cell at the specified index on the board.
     *
     * @param index The index representing the position of the cell on the board.
     * @return The Cell at the specified index.
     */
    public Cell getCell(int index) {
        return this.theCells[index];
    }

    /**
     * Gets the total number of cells on the board.
     *
     * @return The total number of cells on the board.
     */
    public int getNbCells() {
        return this.nbOfCells;
    }
}
