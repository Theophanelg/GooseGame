package goosegame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

import goosegame.board.ClassicalBoard;

public class CellTest {

    @Test
    public void testGetNum() {
        Cell cell = new Cell(42);
        assertEquals(42, cell.getNum());
    }

    @Test
    public void testGetPlayer() {
        Cell cell = new Cell(7);
        assertNull(cell.getPlayer());

        Player player = new Player("Alice", new ClassicalBoard());
        cell.setPlayer(player);
        assertEquals(player, cell.getPlayer());
    }

    @Test
    public void testSetPlayer() {
        Cell cell = new Cell(15);
        assertNull(cell.getPlayer());

        Player player = new Player("Bob", new ClassicalBoard());
        cell.setPlayer(player);

        assertEquals(player, cell.getPlayer());
    }

    @Test
    public void testRebounce() {
        Cell cell = new Cell(20);
        Player player = new Player("Charlie", new ClassicalBoard());

        cell.rebounce(player);
        assertNull(cell.getPlayer()); 

        class SpecialCell extends Cell {
            public SpecialCell(int num) {
                super(num);
            }

            @Override
            public void rebounce(Player player) {
                player.setCell(new Cell(5));
            }
        }

        SpecialCell specialCell = new SpecialCell(10);
        specialCell.rebounce(player);

        assertEquals(5, player.getCell().getNum());
    }
}
