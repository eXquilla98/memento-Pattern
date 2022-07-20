package org.example;

public class Game {
    String gameTitle;

    public Game(String gameTitle){

        this.gameTitle = gameTitle;
    }
    @Override
    public String toString(){
        return "Game[Game title =" + gameTitle +"]";
    }
}
