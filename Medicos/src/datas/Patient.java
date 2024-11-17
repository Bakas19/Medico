package datas;

public class Patient extends Person {

private String Symptoms;

    public Patient(String name, String surnmane, int age, Gender gender, String symptoms) {
        super(name, surnmane, age, gender);
        Symptoms = symptoms;
    }


    public Patient(){}
    @Override
    public String toString() {
        return "Patient{" +
                "Symptoms='" + Symptoms + '\'' +
                '}';
    }

    @Override
    public String info(String name, String surname, int age) {
        return "  " + name + " " + surname + ", " + age+ " лет, "  ;
    }



    public String detail( Disease disease, String name, String surname, int age ){
        System.out.println("Информация о пациенте");
        return name + " "+ surname + ", " + age + " лет," + " Название заболевания: " + disease.getName() + ", Состояние заболевания: " + disease.getDiseaseSeverity() ;

    }






    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String symptoms) {
        Symptoms = symptoms;
    }
}
