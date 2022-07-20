package org.example;

import java.util.Stack;

public class careTaker {

    Stack<gamelibrary.GameMomento> history = new Stack<>();
    public  void savegamelibrary(gamelibrary gamelibrary){
        history.push(gamelibrary.savegamelibrary());
    }
    public void removeFromLibrary(gamelibrary gamelibrary){
        if(!history.isEmpty())
            gamelibrary.removeFromLibrary(history.pop());
        else
            System.out.println("library is empty!");
    }
}
