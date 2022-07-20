package org.example;

public class Main {
    public static void main(String[] args) {
          careTaker careTaker=new careTaker();
          gamelibrary gamelibrary = new gamelibrary();

          gamelibrary.addGame(new Game("Planetside2"));

          careTaker.savegamelibrary(gamelibrary);
          System.out.println(gamelibrary);

          gamelibrary.addGame(new Game("witcher3"));

        careTaker.savegamelibrary(gamelibrary);
        System.out.println(gamelibrary);

        careTaker.removeFromLibrary(gamelibrary);
        System.out.println(gamelibrary);
        gamelibrary.addGame(new Game("Halo"));

        careTaker.savegamelibrary(gamelibrary);
        System.out.println(gamelibrary);
        careTaker.removeFromLibrary(gamelibrary);
        System.out.println(gamelibrary);
    }
}