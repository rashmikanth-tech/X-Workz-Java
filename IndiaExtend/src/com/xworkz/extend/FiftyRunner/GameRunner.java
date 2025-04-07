package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.game.Chess;
import com.xworkz.extend.fiftyfold.game.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
        game.strategy();
        game.opponent();
        game.winner();
        game.duration();

        Game game1 = new Game();
        game1.play();
        game1.strategy();
        game1.opponent();
        game1.winner();
        game1.duration();

        System.out.println("-----------");

        Chess chess = new Chess();
        chess.play();
        chess.strategy();
        chess.opponent();
        chess.winner();
        chess.duration();
    }
}
