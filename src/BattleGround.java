import Enemy.*;
import Heroes.Archer;
import Heroes.Mage;
import Heroes.Warrior;

import java.util.ArrayList;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Лучник ", 50);
        Mage mage = new Mage("Волшебник ", 100);
        Warrior warrior = new Warrior("Воин ", 150);

        ArrayList <Zombie> zombies = new ArrayList<>();
        zombies.add(new Zombie("Zombie1",50));
        zombies.add(new Zombie("Zombie2",50));
        zombies.add(new Zombie("Zombie3",50));

        System.out.println("Бой начался!:");
        for (Zombie zomb : zombies) {

                archer.attackEnemy(zomb);
                mage.attackEnemy(zomb);
                warrior.attackEnemy(zomb);

            System.out.println();

                zomb.attackHero(archer);
                zomb.attackHero(mage);
                zomb.attackHero(warrior);
        }



    }
}
