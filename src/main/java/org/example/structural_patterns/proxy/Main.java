package org.example.structural_patterns.proxy;

import org.example.structural_patterns.proxy.game_impl.ProxyGameImpl;

public class Main {
    public static void main(String[] args) {
        ProxyGameImpl proxyGame = new ProxyGameImpl(Server.ALFA);
        proxyGame.play();
        proxyGame.play();
    }
}
