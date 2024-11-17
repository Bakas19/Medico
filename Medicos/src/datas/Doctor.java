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



Scanner input = new Scanner(System.in);



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
  
public  Map<String, String> avail(){

    HashMap<String, String> days = new HashMap<>();

    days.put("Monday", "From 10am to 1pm to ");
    days.put("Tuesday", "From 08 am to 1pm to ");
    days.put("Friday", "From 10am to 1pm to ");


for (Map.Entry<String,  String> dias : days.entrySet() ){

    System.out.println("Available  : " + dias.getKey() + ",  " + dias.getValue());

      String value = dias.getValue();


}
    System.out.println("Selecione o dia que deseja ");


    String choice = input.next();
    String key = days.get(choice);



    if (days.containsKey(choice))
    {
        System.out.println("Paulo, vocce marcou a sua data para " + key );
    } else
    {
        System.out.println( choice+  " Nao existe");
    }

    return days;


 }




}
