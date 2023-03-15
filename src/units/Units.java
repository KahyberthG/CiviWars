package units;

import resources.Tile;

public class Units {
    private int health;
    private int movement;
    private Tile tile;
    private UnitType type;

    public Units(UnitType type,Tile tile) {
        health = type.getMaxHealt();
        movement = type.getMovement();
    }


}


