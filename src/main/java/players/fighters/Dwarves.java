package players.fighters;

import players.Player;
import stuff.tools.Weapon;

public class Dwarves extends Player {

    private Weapon weapon;
    private int height;

    public Dwarves(String name, int health, int energy, Weapon weapon, int height) {
        super(name, health, energy);
        this.weapon = weapon;
        this.height = height;
    }
}
