package players.healers;

import players.Player;
import stuff.tools.Healing;

public class Cleric extends Player {

    private Healing healing;

    public Cleric(String name, int health, int energy, Healing healing) {
        super(name, health, energy);
        this.healing = healing;
    }
}
