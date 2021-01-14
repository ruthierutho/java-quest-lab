package players.mages;

import behaviours.IFight;
import behaviours.ISpell;
import players.Player;
import stuff.Treasure;
import stuff.tools.Spell;
import stuff.tools.Weapon;

import java.util.ArrayList;

public class Wizard extends Player implements IFight, ISpell {

    private Weapon weapon;
    private Spell spell;

    public Wizard(String name, int health, int energy, Weapon weapon, Spell spell){
        super(name, health, energy);
        this.weapon = weapon;
        this.spell = spell;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }

    public Spell getSpell() {
        return this.spell;
    }

    @Override
    public void fight(Weapon weapon) {
        //get weapon damage int
        this.getWeapon().damage;
        //get enemy health int
        //enemy.health - weapon.damage
        //wizard.energy - weapon.effort
    }

    @Override
    public void castSpell(Spell spell) {

    }
}
