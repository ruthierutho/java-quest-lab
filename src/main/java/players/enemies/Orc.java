package players.enemies;

import players.Player;
import stuff.tools.Weapon;

public class Orc extends Player {

    private Weapon weapon;
    private int strength;

    public Orc(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }
}
