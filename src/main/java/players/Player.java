package players;

import stuff.Treasure;
import stuff.tools.Weapon;

import javax.tools.Tool;
import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Treasure> bag;


    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.bag = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

}
