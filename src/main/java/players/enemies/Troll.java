package players.enemies;

import players.Player;
import stuff.tools.Weapon;

public class Troll extends Player {

    private Weapon weapon;
    private int strength;

    public Troll(String name, int health, Weapon weapon, int strength) {
        super(name, health);
        this.weapon = weapon;
        this.strength = strength;
    }
}
