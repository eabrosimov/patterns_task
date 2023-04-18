package org.example.structural_patterns.proxy.game_impl;

import org.example.structural_patterns.proxy.Game;
import org.example.structural_patterns.proxy.Server;

public class GameImpl implements Game {
    private Server gameServer;

    public GameImpl(Server gameServer){
        this.gameServer = gameServer;
        logIn();
    }

    public void logIn(){
        System.out.println("Авторизация на сервере " + gameServer);
    }

    @Override
    public void play() {
        System.out.println("Начало игры на сервере " + gameServer);
    }
}
