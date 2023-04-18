package org.example.structural_patterns.adapter;

public class Adapter implements USB{
    PhoneMemoryCard phoneMemoryCard;

    public Adapter(PhoneMemoryCard card){
        phoneMemoryCard = card;
    }
    @Override
    public void connectToComputer() {
        phoneMemoryCard.saveInformation();
    }
}
