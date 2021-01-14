package players.fighters;

import players.Player;
import stuff.tools.Weapon;

public class Dwarves extends Player {

    private Weapon weapon;
    private int height;

    public Dwarves(String name, int health, Weapon weapon, int height) {
        super(name, health);
        this.weapon = weapon;
        this.height = height;
    }
}
