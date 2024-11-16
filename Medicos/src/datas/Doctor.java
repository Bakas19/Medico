package datas;

import java.util.*;

public class Doctor extends Person {
private String speciality;
private int experience;

  

  





    public Doctor(String name, String surnmane, int age, Gender gender, String speciality, int experience) {
    super(name, surnmane, age, gender);
    this.speciality = speciality;
    this.experience = experience;



}

    public Doctor(){};







    @Override
    public String toString() {
        return "Doctor [speciality=" + speciality + ", experience=" + experience + ", getGender()=" + getGender()
                + ", getName()=" + getName() + ", avail()=" + avail() + ", getSurnmane()=" + getSurnmane()
                + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }







    @Override
   public String info(String name, String surname, int age) {
       return "Name + " + name + " " + surname + " " + age+ "years old" ;
    }

  public   String info (String specialty, int experience ){

        return  "Professional info" + specialty + " with " + experience +" experience";
    }
  
public  HashMap<String, String> avail(){

    HashMap<String, String> days = new HashMap<>();

    days.put("Monday", "From 10am to 1pm to ");
    days.put("Tuesday", "From 08 am to 1pm to ");
    days.put("Friday", "From 10am to 1pm to ");


System.out.println(days.keySet() + "\n" +
        ""+ days.values());
    return days;


 }




}
