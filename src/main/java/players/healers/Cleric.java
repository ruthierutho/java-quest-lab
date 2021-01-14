package players.healers;

import players.Player;
import stuff.tools.Healing;

public class Cleric extends Player {

    private Healing healing;

    public Cleric(String name, int health, Healing healing) {
        super(name, health);
        this.healing = healing;
    }
}
