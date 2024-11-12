package datas;

public class Patient extends Person {

private String Symptoms;

   public Patient(String name, String surnmane, int age, boolean foreigners, Disease disease, String Symptoms) {
      super(name, surnmane, age, foreigners);
      this.disease = disease;
      this.Symptoms = Symptoms;
   }

   
   public String getSymptoms() {
      return Symptoms;
   }

   public void setSymptoms(String symptoms) {
      Symptoms = symptoms;
   }


   private Disease disease;

   public Disease getDisease() {
      return disease;
   }

   public void setDisease(Disease disease) {
      this.disease = disease;
   }

    @Override
    public String info(String name, String surname, int age) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String personalData(String name, String surname,  int age, String Symptoms){

      return "Info datas.Doctor: " + name +" " +surname + " " + age + " years old" + "Symptoms" + Symptoms;
          }


          
}
