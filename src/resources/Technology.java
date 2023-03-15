package resources;

public class Technology {

    private String name;
    private int scienceCost;


    public Technology(String name, int scienceCost) {
        this.name = name;
        this.scienceCost = scienceCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScienceCost() {
        return scienceCost;
    }

    public void setScienceCost(int scienceCost) {
        this.scienceCost = scienceCost;
    }
}
