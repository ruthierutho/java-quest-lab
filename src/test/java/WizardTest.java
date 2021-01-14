import org.junit.Before;
import org.junit.Test;
import players.mages.Wizard;
import stuff.tools.Spell;
import stuff.tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Weapon weapon;
    Spell spell;

    @Before
    public void setUp(){
        weapon = new Weapon("Staff", 80);
        spell = new Spell("Fireball", 80);
        wizard = new Wizard("Gandalf", 100, weapon, spell);
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
}
