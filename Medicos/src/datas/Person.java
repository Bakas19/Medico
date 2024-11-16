package datas;

  abstract class Person {
    private String name;
    private String surnmane;
    private int age;
    private Gender gender;


   

    public Person(String name, String surnmane, int age, Gender gender) {
      this.name = name;
      this.surnmane = surnmane;
      this.age = age;
      this.gender = gender;
    }

    public Person(){}


    public Gender getGender() {
      return gender;
    }


    public void setGender(Gender gender) {
      this.gender = gender;
    }





  


    abstract  String info(String name, String surname, int age);


    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSurnmane() {
      return surnmane;
    }

    public void setSurnmane(String surnmane) {
      this.surnmane = surnmane;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

  

    
 
  }
