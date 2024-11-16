package datas;

public class Disease {
    private String name;
    private String DiseaseSeverity;


    public Disease(String name, String diseaseSeverity) {
        this.name = name;

        DiseaseSeverity = diseaseSeverity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiseaseSeverity() {
        return DiseaseSeverity;
    }

    public void setDiseaseSeverity(String diseaseSeverity) {
        DiseaseSeverity = diseaseSeverity;
    }

}


