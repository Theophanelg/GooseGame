package goosegame.board;

import java.util.List;

import goosegame.Board;
import goosegame.cell.*;
import goosegame.Cell;

/**
 * Represents a classical game board for the goose game.
 * Extends the abstract Board class and defines the configuration of the classical game board.
 * This board includes special cell types such as GooseCells, DeadCells, FinalCase, TrapCells, TreeCells,
 * WaitingCells, and WellCells, with predefined positions.
 */
public class ClassicalBoard extends Board {

    /**
     * Constructs a new ClassicalBoard with a total of 64 cells.
     */
    public ClassicalBoard() {
        super(63);
        this.GooseCell = List.of(5, 6, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59);
        this.DeadCell = List.of(58);
        this.FinalCase = List.of(63);
        this.TrapCell = List.of(52);
        this.TreeCell = List.of(19);
        this.WellCell = List.of(31);
        initBoard();
    }

    /**
     * Initializes the ClassicalBoard by creating instances of the Cell class for
     * each cell on the board.
     */
    @Override
    protected void initBoard() {
        for (int i = 0; i < nbOfCells; i++) {
            Cell cell;
            if (this.GooseCell.contains(i)) {
                cell = new GooseCell(i);
            } else if (this.DeadCell.contains(i)) {
                cell = new DeadCell(i);
            } else if (this.TrapCell.contains(i)) {
                cell = new TrapCell(i);
            } else if (this.TreeCell.contains(i)) {
                cell = new TreeCell(i);
            } else if (this.WellCell.contains(i)) {
                cell = new WellCell(i);
            } else {
                cell = new Cell(i);
            }
            theCells[i] = cell;
        }
    }

}
