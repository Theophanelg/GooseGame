package goosegame;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import goosegame.board.ClassicalBoard;

public class GameTest {
    @Test
    public void addPlayerTest(){
        ClassicalBoard board = new ClassicalBoard();
        Game game = new Game(board);
        Player player1 = new Player("Roxanne", board);

        game.addPlayer(player1);

        assertTrue(game.getPlayer(player1));   
    }


}
