package units;

public class UnitType {

    private int goldCost;
    private String name;
    private int movement;
    private int maxHealth;

    public UnitType(String name, int goldCost, int movement, int maxHealth) {
        this.name = name;
        this.goldCost = goldCost;
        this.movement = movement;
        this.maxHealth = maxHealth;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getMaxHealt() {
        return maxHealth;
    }

    public void setMaxHealt(int maxHealt) {
        this.maxHealth = maxHealt;
    }
}
