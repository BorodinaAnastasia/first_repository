package Heroes;

import Enemy.*;

public class Mage extends Hero {
    public Mage(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy enemy){
        System.out.println("Герой " + getName() + "атакует " + enemy.getName() + ":");
        enemy.takeDamage(20);
        enemy.countHealth();

    }
}


