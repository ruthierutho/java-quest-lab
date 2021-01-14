package players.enemies;

import players.Player;

public class Dragon extends Player {

    private int fuel;

    public Dragon(String name, int health, int fuel) {
        super(name, health);
        this.fuel = fuel;
    }
}
