package Heroes;
import Enemy.*;


public class Archer extends Hero {
    public Archer(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy enemy){
        System.out.println("Герой " + getName() + "атакует " + enemy.getName() + ":");
        enemy.takeDamage(20);
        enemy.countHealth();

    }
}
