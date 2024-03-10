package goosegame;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the game controller for the goose game.
 */
public class Game {
    /**
     * The list of players participating in the game.
     */
    protected List<Player> thePlayers = new ArrayList<>();

    /**
     * The game board on which the players play.
     */
    protected Board board;

    /**
     * Constructs a new Game with the specified game board.
     *
     * @param board The game board on which the players play.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * Adds a player to the game.
     *
     * @param p The player to be added to the game.
     */
    public void addPlayer(Player p) {
        thePlayers.add(p);
    }

    /**
     * Checks if the specified player is part of the current players in the game.
     *
     * @param p The player to check.
     * @return {@code true} if the player is in the game; {@code false} otherwise.
     */
    public boolean getPlayer(Player p) {
        return thePlayers.contains(p);
    }

    // TODO FINIR LA METHODE PLAY
    /**
     * Plays the game in turns until one or more players finish the game.
     * Players take turns moving on the game board.
     * The game finishes when at least one player is unable to play.
     */
    public void play() {
        while (!endGame()) {
            // NON OPERATIONNEL
            for (Player p : thePlayers) {
                if (p.isEnableToPlay()) {
                    p.move();
                } else {
                    System.out.println(p.toString() + " can't play");
                }
            }
        }
    }

    /**
     * Checks if the game has ended by determining whether any player has reached
     * the final cell.
     *
     * @return {@code true} if any player has reached the final cell, indicating the
     *         end of the game; {@code false} otherwise.
     */
    public boolean endGame() {
        for (Player p : thePlayers) {
            if (p.getNumCell() == 64) {
                return true;
            }
        }
        return false;
    }
}