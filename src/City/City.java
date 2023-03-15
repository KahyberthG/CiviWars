package City;

import resources.Tile;
import structures.Building;
import units.Units;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private Tile tile;
    private int population;
    private int food;
    private int production;
    private List<Units> garrison;
    private List<Building> buildings;

    public City (Tile tile, String name) {
        this.tile = tile;
        this.name = name;
        this.population = 1;
        this.food = 0;
        this.production = 0;
        this.garrison = new ArrayList<>();
        this.buildings = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public List<Units> getGarrison() {
        return garrison;
    }

    public void setGarrison(List<Units> garrison) {
        this.garrison = garrison;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
}
