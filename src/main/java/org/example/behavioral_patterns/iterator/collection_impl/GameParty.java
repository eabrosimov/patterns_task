package org.example.behavioral_patterns.iterator.collection_impl;

import org.example.behavioral_patterns.iterator.Collection;
import org.example.behavioral_patterns.iterator.Iterator;

public class GameParty implements Collection {
    private String[] members;

    public GameParty(String[] members){
        this.members = members;
    }

    @Override
    public Iterator getIterator() {
        return new memberIterator();
    }

    private class memberIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < members.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return members[index++];
        }
    }
}
