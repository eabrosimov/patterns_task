package org.example.creational_patterns.prototype;

import org.example.creational_patterns.prototype.copyable_impl.Monster;

public class Main {
    public static void main(String[] args) {
        Monster skeleton = new Monster("Skeleton", "RuinsOfAgony", 20, 10, 15);
        MonsterFactory factory = new MonsterFactory(skeleton);
        Monster skeletonCopy = factory.returnCopy();

        System.out.println(skeleton);
        System.out.println(skeletonCopy);


    }
}
