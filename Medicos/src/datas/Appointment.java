package datas;


import java.util.ArrayList;

import java.util.List;


public class Appointment {
    private String day;
    private String hour;

    private Patient patient;

    public Appointment(String day, String hour, Patient patient) {
        this.day = day;
        this.hour = hour;
        this.patient = patient;
    }

    public Appointment() {
    }





    @Override
    public String toString (){
        return "Nome " +  getPatient().getName() + " " + getPatient().getSurnmane() +
                " sexo: " + getPatient().getGender() + " " + getPatient().getAge()  +
                " a sua foi marcada para " + getDay() +
                " as " + getHour() +
                " com " + getPatient().getSymptoms() + "";
    }



    public List<Appointment> appointmentList() {
        List<Appointment> appointments = new ArrayList<>();

        // Adicionar consultas
        appointments.add(new Appointment("Monday", "11:00",
                new Patient("Paulo", "Baks", 25, Gender.MALE, "dor de cabeca")));
        appointments.add(new Appointment("Monday", "11:00",
                new Patient("Mauro", "Jobr", 25, Gender.MALE, "dor de cabeca")));





     for (Appointment lista : appointments){
         System.out.println(lista);
     }
        return appointments;
    }









    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

