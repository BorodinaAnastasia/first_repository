package Heroes;
import Enemy.*;


public abstract class Hero {
    private String name;
    private int health;
    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }
    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return health > 0;
    }

    // уменьшает кол-ва здоровья в соответствии с полученным уроном
    public void takeDamage(int damage) {
        health -= damage;
    }
    //остаток здоровья у героя
    public void countHealth(){
        if (!isAlive()){
            System.out.println("Герой " + getName() + "убит");
        }
        else {
            System.out.println("У героя " + getName() + "остаток здоровья " + getHealth());
        }
    }
}
