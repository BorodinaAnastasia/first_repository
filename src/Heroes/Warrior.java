package Heroes;


import Enemy.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy enemy){
        System.out.println("Герой " + getName() + "атакует " + enemy.getName() + ":");
        enemy.takeDamage(20);
        enemy.countHealth();

    }
}



