package goosegame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import goosegame.board.ClassicalBoard;

public class PlayerTest {

    @Test
    public void testMove() {
        ClassicalBoard board = new ClassicalBoard();
        Player player = new Player("Timo", board);

        int initialCellNum = player.getCell().getNum();

        player.move();

        assertNotEquals(initialCellNum, player.getCell().getNum());
    }

    @Test
    public void testSetCell() {
        ClassicalBoard board = new ClassicalBoard();
        Player player = new Player("Timo", board);

        Cell newCell = new Cell(5);
        player.setCell(newCell);

        assertEquals(newCell, player.getCell());
    }
}
