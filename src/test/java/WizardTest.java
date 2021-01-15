import org.junit.Before;
import org.junit.Test;
import players.enemies.Orc;
import players.mages.Wizard;
import stuff.tools.Spell;
import stuff.tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Weapon weapon;
    Spell spell;
    Orc orc;

    @Before
    public void setUp(){
        weapon = new Weapon("Staff", 80, 8);
        spell = new Spell("Fireball", 80);
        wizard = new Wizard("Gandalf", 100, 100, weapon, spell);
        orc = new Orc("Grob", 90, 100, 80);
    }

    @Test
    public void canGetName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(weapon, wizard.getWeapon());
    }

    @Test
    public void canGetSpell(){
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canGetEnergy(){
        assertEquals(100, wizard.getEnergy());
    }

    @Test
    public void canSetHealth(){
        wizard.setHealth(90);
        assertEquals(90, wizard.getHealth());
    }
    @Test
    public void canSetEnergy(){
        wizard.setEnergy(80);
        assertEquals(80, wizard.getEnergy());
    }

    @Test
    public void canReduceEnergy(){
        wizard.reduceEnergy(10);
        assertEquals(90, wizard.getEnergy());
    }

    @Test
    public void canReduceHealth(){
        orc.reduceHealth(80);
        assertEquals(10, orc.getHealth());
    }

    @Test
    public void canDoAFight(){
        wizard.fight(weapon, orc);
        assertEquals(92, wizard.getEnergy());
        assertEquals(10, orc.getHealth());
    }
}
