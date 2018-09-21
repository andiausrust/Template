package com.andi.model;

import com.andi.Game;

public class EndlessRunnerGame extends Game {

    @Override
    public void initialize() {
        System.out.println("endless runner init ...");
    }

    @Override
    public void startPlay() {
        System.out.println("endless runner start ...");

    }

    @Override
    public void endPlay() {
        System.out.println("endless runner end ... ");

    }

}
