package goosegame;

import goosegame.board.ClassicalBoard;

/**
 * Entry point for the goose game application.
 */
public class Main {
    /**
     * Main method serving as the entry point for the goose game application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instance of ClassicalBoard
        ClassicalBoard cBoard = new ClassicalBoard();

        // Instance of Player
        Player p1 = new Player("Roxanne", cBoard);
        Player p2 = new Player("Dindon", cBoard);

        // Instance of Game
        Game game = new Game(cBoard);

        // Add player in game
        game.addPlayer(p1);
        game.addPlayer(p2);

        // Launch game
        game.play();
    }
}
