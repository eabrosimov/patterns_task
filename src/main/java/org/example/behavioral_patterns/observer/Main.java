package org.example.behavioral_patterns.observer;

import org.example.behavioral_patterns.observer.observed_impl.StockMarket;
import org.example.behavioral_patterns.observer.observer_impl.FinancialNewspaper;
import org.example.behavioral_patterns.observer.observer_impl.Investor;
import org.example.behavioral_patterns.observer.observer_impl.MarketAnalyst;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer investor = new Investor();
        Observer analyst = new MarketAnalyst();
        Observer newspaper = new FinancialNewspaper();

        market.addObserver(investor);
        market.addObserver(analyst);
        market.addObserver(newspaper);

        market.setIndexSnP500(505);
    }
}
