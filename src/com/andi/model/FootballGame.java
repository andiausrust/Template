package com.andi.model;

import com.andi.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballGame extends Game {


    @Override
    public void initialize() {
        System.out.println(("football init ..."));
    }

    @Override
    public void startPlay() {
        System.out.println("football play ...");
    }

    @Override
    public void endPlay() {
        System.out.println("football end ...");
    }


}
