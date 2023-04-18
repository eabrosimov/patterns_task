package org.example.structural_patterns.proxy.game_impl;

import org.example.structural_patterns.proxy.Game;
import org.example.structural_patterns.proxy.Server;
import org.example.structural_patterns.proxy.game_impl.GameImpl;

public class ProxyGameImpl implements Game {
    private Server gameServer;
    private GameImpl gameImpl;

    public ProxyGameImpl(Server gameServer){
        this.gameServer = gameServer;
    }

    @Override
    public void play() {
        if(gameImpl == null){
            gameImpl = new GameImpl(gameServer);
        }
        gameImpl.play();
    }
}
