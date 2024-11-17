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
        return " name " + getName() + " " + getSurnmane() + "sexo " + getAge() + " " + getGender() + " " + getSpeciality() + "" + getExperience();
    }







    @Override
   public String info(String name, String surname, int age) {
       return "  " + name + " " + surname + ", " + age+ " лет, " + info("стоматолог" , 5) ;
    }

  public   String info ( String specialty, int experience ){

        return  " " + specialty + " С опытом работы " + experience +" лет";
    }
  
public  Map<String, String> avail(){

    HashMap<String, String> days = new HashMap<>();

    days.put("Понедельник", "С 10 утра до 13 часов");
    days.put("Вторник", "С 09 утра до 15 часов ");
    days.put("Пятница", "С 10 утра до 15 часов ");


for (Map.Entry<String,  String> dias : days.entrySet() ){

    System.out.println("Доступно  : " + dias.getKey() + ",  " + dias.getValue());

      String value = dias.getValue();


}
    System.out.println("Выберите нужный день");


    String choice = input.next();
    String key = days.get(choice);
    System.out.println("Пожалуйста, напишите ваше имя, чтобы записаться на прием");
    String name = input.next();

Doctor doctor = new Doctor();

    if (days.containsKey(choice))
    {
        System.out.println( "Привет"+ name + " ты записался на прием к доктору " + doctor.info("Mark", "Job", 58) + " в " + key );
    } else
    {
        System.out.println( choice+  " Nao existe");
    }

    return days;


 }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
