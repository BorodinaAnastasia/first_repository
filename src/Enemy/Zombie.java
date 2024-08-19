package Enemy;

import Heroes.Hero;

public class Zombie extends Enemy {
    private int countLive = 1;

    public Zombie(String name, int health) {
        super(name, health);
    }

    public void attackHero(Hero hero) {
        System.out.println("Враг " + getName() + " атакует " + hero.getName() + ":");
        hero.takeDamage(30);
        hero.countHealth();
    }

    public void countHealth() {
        if (!isAlive()) {
            System.out.println("Враг " + getName() + " убит");
            setHealth(50);
            System.out.println(getName() + " воскрес");
        } else {
            System.out.println("У " + getName() + " остаток здоровья " + getHealth());
        }
    }
}



