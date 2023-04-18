package org.example.behavioral_patterns.iterator;

import org.example.behavioral_patterns.iterator.collection_impl.GameParty;

public class Main {

    public static void main(String[] args) {
        String[] members = new String[]{"Биш", "ЕЕ", "БД", "СВС", "Сорк", "ММ", "СХ", "Некр", "Конь"};
        GameParty gameParty = new GameParty(members);
        Iterator iterator = gameParty.getIterator();
        System.out.println("Состав группы: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
