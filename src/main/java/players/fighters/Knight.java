package players.fighters;

import players.Player;
import stuff.tools.Weapon;

public class Knight extends Player {

    private Weapon weapon;
    private int armour;

    public Knight(String name, int health, Weapon weapon, int armour) {
        super(name, health);
        this.weapon = weapon;
        this.armour = armour;
    }
}
