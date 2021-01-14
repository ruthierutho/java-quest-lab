package players.mages;

import players.Player;
import stuff.Treasure;
import stuff.tools.Spell;
import stuff.tools.Weapon;

import java.util.ArrayList;

public class Wizard extends Player {

    private Weapon weapon;
    private Spell spell;

    public Wizard(String name, int health, Weapon weapon, Spell spell){
        super(name, health);
        this.weapon = weapon;
        this.spell = spell;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }

    public Spell getSpell() {
        return this.spell;
    }
}
