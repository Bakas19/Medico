package datas;


public class Appointment {
private String day;
private int hour;

Patient patient;

public Appointment(String day, int hour, Patient patient) {
    this.day = day;
    this.hour = hour;
    this.patient = patient;
    
}




public boolean appointIsDOne(){
    return true;
}


public String appoint(Patient patient, String day, int hour){
    

    return "Name" + patient.getName() + " "+ patient.getSurnmane() + "Age" + patient.getAge() ;

}


public String datas(){

    return "datas.Patient datas: "+ patient.getName()  + " " + patient.getSurnmane()+  " age"+ patient.getAge() + "" + patient.isForeigners() +  patient.getDisease();
}











public String getDay() {
    return day;
}

public void setDay(String day) {
    this.day = day;
}

public int getHour() {
    return hour;
}

public void setHour(int hour) {
    this.hour = hour;
}

public Patient getPatient() {
    return patient;
}

public void setPatient(Patient patient) {
    this.patient = patient;
}



}
