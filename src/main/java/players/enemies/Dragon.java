package players.enemies;

import players.Player;

public class Dragon extends Player {

    private int fuel;

    public Dragon(String name, int health, int energy, int fuel) {
        super(name, health, energy);
        this.fuel = fuel;
    }
}
