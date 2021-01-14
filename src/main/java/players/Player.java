package players;

import stuff.Treasure;
import stuff.tools.Weapon;

import javax.tools.Tool;
import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private int energy;
    private ArrayList<Treasure> bag;


    public Player(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.bag = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        this.energy = newEnergy;
    }
}
