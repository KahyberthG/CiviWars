import resources.Technology;

import java.util.ArrayList;
import java.util.List;

public class Civiwars {


    private String name;
    private int gold;
    private int science;
    private int religion;
    private List<Technology> technology;


    public Civiwars(String name) {
        this.name = name;
        gold = 100;
        science = 0;
        religion = 0;
        technology = new ArrayList<Technology>();
    }



}
