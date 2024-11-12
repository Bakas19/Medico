package datas;

import java.util.ArrayList;
import java.util.List;

public class Doctor  extends Person{

    private String specialty;
    private int experience;

    


    
 

    public Doctor(String name, String surnmane, int age, boolean foreigners, String specialty, int experience)
             {
        super(name, surnmane, age, foreigners);
        this.specialty = specialty;
        this.experience = experience;
       
    }
        


    public String personalData(String name, String surname, String epecialty, int experience, int age){

return "Info Doctor: " + name +" " +surname + " " + age + " years old" + "speciality: " + epecialty+
" with " + experience + "years of experience";
    }

    @Override
    public   String info(String name, String surname, int age){
        return "Name: " + name + " Surnmae:"+ surname + " Age" + age;
    }
/*public String datas(){
    Patient pat = new Patient("Bakas", "Mau", 65, false,new Disease(52, 56, "Malaria"), "Dor de cabeca");

    return "Name" + pat.getName() + pat.getSurnmane() + " age" + pat.getAge() + " is foreign"+ pat.isForeigners() + " felinng" + pat.getSymptoms();
}
    */
    public List<Appointment> lisPatients( ){


        //Patient pat = new Patient("Bakas", "Mau", 65, false,new Disease(52, 56, "Malaria"), "Dor de cabeca");
        List<Appointment> patients = new ArrayList<>();


        patients.add(   new Appointment("Mondey", 15, new Patient("Paulo", "Mikoko", 58, true, new Disease(52, 56, "Tifoid"), "Dor de cabeca")));

        patients.add(new Appointment("Sunday", 12, new Patient("Ernesto  ", "Mark", 95, true, new Disease(52, 98, "Malaria"), "Maulo")));

        for (Appointment appointment : patients) {
            System.out.println("Name: " + appointment.getPatient().getName() + " "+ appointment.getPatient().getSurnmane() + " age: "  + appointment.getPatient().getName() + " felling:" + appointment.getPatient().getSymptoms() + " \n" +
                    " at " + appointment.getHour() + " in " + appointment.getDay());
        }

        return  patients;


    }























    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

   

   

    
}
