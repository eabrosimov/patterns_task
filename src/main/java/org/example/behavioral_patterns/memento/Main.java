package org.example.behavioral_patterns.memento;

public class Main {

    public static void main(String[] args) {
        Character archer = new Character("Лучник");
        String item = "Супер мега ультра лук +16 заточка зачарование очарование -10% по ипотеке и вообще всем хана";
        archer.pickUpItem(item);

        System.out.println(archer.getName() + " поднимает предмет " + archer.getItem());
        System.out.println("============================================================");

        WarehouseKeeper keeper = new WarehouseKeeper();
        keeper.setWarehouse(archer.putItemInWarehouse());

        System.out.println(archer.getName() + " кладет предмет на склад под ответственность хранителя склада");
        System.out.println("Теперь у него нет предметов " + archer.getItem());
        System.out.println("============================================================");

        archer.pickUpItemFromWarehouse(keeper.getWarehouse());
        System.out.println(archer.getName() + " забирает предмет со склада");
        System.out.println("Теперь у него в руках " + archer.getItem());



    }
}
