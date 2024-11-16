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
        return "Name + " + name + " " + surname + " " + age+ "years old" ;
    }



    public String detail( Disease disease, String name, String surname, int age ){
        System.out.println("Information about patiente");
        return name + ""+ surname + " " + age + " " + disease.getName() + " " + disease.getDiseaseSeverity() ;

    }






    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String symptoms) {
        Symptoms = symptoms;
    }
}
