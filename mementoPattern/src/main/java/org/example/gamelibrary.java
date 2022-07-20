package org.example;

import java.util.ArrayList;

public class gamelibrary {
    ArrayList<Game> games= new ArrayList<>();

    public void addGame(Game game){
        games.add(game);

    }
    public ArrayList<Game>getGames(){

        return (ArrayList)games.clone();

    }

    @Override
    public String toString() {
        return "gamelibrary{" +
                "games=" + games +
                '}';
    }
    public GameMomento savegamelibrary()
    {
        return new GameMomento(getGames());

    }
   public void removeFromLibrary(GameMomento gameMomento){

        games = gameMomento.getGames();

   }

    static class GameMomento{
        ArrayList<Game> games;

        public GameMomento(ArrayList<Game> games){
            this.games = games;
        }

        private  ArrayList<Game> getGames(){
            return games;
        }

    }
}
