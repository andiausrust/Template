package com.andi;

import com.andi.model.EndlessRunnerGame;
import com.andi.model.FootballGame;

public class Main {

    public static void main(String[] args) {
	    Game game = new FootballGame();
	    game.play();

	    Game game2 = new EndlessRunnerGame();
	    game2.play();
    }
}
