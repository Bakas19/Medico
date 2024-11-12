import datas.Appointment;
import datas.Disease;
import datas.Doctor;
import datas.Patient;

public class Main {
    public static void main(String[] args) {
       

Doctor doctor = new Doctor("Marck", "Salvio ", 65, false , "Geral medic", 69);

        Patient pat = new Patient("Bakas", "Mikoko", 65, false,new Disease(52, 56, "Malaria"), "Dor de cabeca");
      
        Appointment appointment = new Appointment(null, 0, pat);
        

        System.out.println("Make a choice");
        int choice = 1;

       switch (choice) {

           case 1 : doctor.lisPatients();
        break;
           case 2 :
               System.out.println("Dados do doctor")
               ;String info = doctor.personalData("Julius", "Jonata","Surhe", 15, 50);
               System.out.println(info);

                break;

           case 3:
               System.out.println("Dados do paciente");
           default:

       }

    //Metas

    /*
     * Metas
     * 
     * 1- Marcar consulta
     *  -saber quais datas o medico está disponivel
     *  - Se for rstrangeiro devemos pedir o seu o seguro
     * 
     * 1  - Ver a lista dos pacientes -FEITO
     * 3- ter dados do pacientes ---FEITO
     * 4- ter dos do medico --FEITO
     * 5 - Ver o resultado da consulta
     *  - se ela foi feita
     *  - Qual foi o resultado, 
     *  - que doenca foi detectada
     * - qual foi o nivel da doenca
     *  -
     * 
     */
}
    }
    

