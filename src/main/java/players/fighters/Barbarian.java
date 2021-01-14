package players.fighters;

import players.Player;
import stuff.tools.Weapon;

public class Barbarian extends Player {

    private Weapon weapon;

    public Barbarian(String name, int health, int energy, Weapon weapon) {
        super(name, health, energy);
        this.weapon = weapon;
    }
}
