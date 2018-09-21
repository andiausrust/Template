package com.andi;

public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //Template method
    public final void play(){
        loadAssets();
        initialize();
        startPlay();
        endPlay();
    }


    // method that is the same for all classes
    void loadAssets() {
        System.out.println("loading game assets ...");
    }

    boolean addNewGameCharacter(){
        return true;
    }
}
