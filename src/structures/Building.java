package structures;

public class Building {

    private String name;
    private int cost;
    private int upkeep;
    private int turnsToBuild;

    public Building(String name, int cost, int upkeep, int turnsToBuild) {
        this.name = name;
        this.cost = cost;
        this.upkeep = upkeep;
        this.turnsToBuild = turnsToBuild;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getUpkeep() {
        return upkeep;
    }

    public void setUpkeep(int upkeep) {
        this.upkeep = upkeep;
    }

    public int getTurnsToBuild() {
        return turnsToBuild;
    }

    public void setTurnsToBuild(int turnsToBuild) {
        this.turnsToBuild = turnsToBuild;
    }
}
