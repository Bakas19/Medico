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
        return " " +  getPatient().getName() + " " + getPatient().getSurnmane() +
                " пол: " + getPatient().getGender() + " " + getPatient().getAge()  +
                " записался к врачу на  " + getDay() +
                " as " + getHour() +
                " симптомы  " + getPatient().getSymptoms() + "";
    }



    public List<Appointment> appointmentList() {
        List<Appointment> appointments = new ArrayList<>();

        // Adicionar consultas
        appointments.add(new Appointment("понедельник", "11:00",
                new Patient("Paulo", "Baks", 25, Gender.MALE, "головной боли")));
        appointments.add(new Appointment("пятница", "11:00",
                new Patient("Mark", "Baks", 25, Gender.MALE, "головной боли")));
        appointments.add(new Appointment("среда", "11:00",
                new Patient("John", "Baks", 25, Gender.MALE, "головной боли")));





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

