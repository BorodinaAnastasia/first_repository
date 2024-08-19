package Enemy;

import Heroes.Hero;
import Interface.Mortal;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    // уменьшает кол-ва здоровья в соответствии с полученным уроном
    public void takeDamage(int damage) {
        health -= damage;
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    //остаток здоровья  у Enemy
    public void countHealth(){
        if (!isAlive()){
            System.out.println(getName() + " убит");
        }
        else {
            System.out.println("У " + getName() + "остаток здоровья " + getHealth());
        }
    }

    }
