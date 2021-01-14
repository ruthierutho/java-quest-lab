package players.fighters;

import players.Player;
import stuff.tools.Weapon;

public class Barbarian extends Player {

    private Weapon weapon;

    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
}
