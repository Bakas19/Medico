package datas;

public class Disease {
    private String name;
    private int DiseaseSeverity;
    private int level;

    public Disease(int DiseaseSeverity, int level, String name) {
        this.DiseaseSeverity = DiseaseSeverity;
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiseaseSeverity() {
        return DiseaseSeverity;
    }

    public void setDiseaseSeverity(int DiseaseSeverity) {
        this.DiseaseSeverity = DiseaseSeverity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    






}


