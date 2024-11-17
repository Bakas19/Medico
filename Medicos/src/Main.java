import datas.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {




        Doctor doctor =  new Doctor();
        Patient patient = new Patient("Paulo","Mikoko", 54,  Gender.MALE, "maul");
        Appointment appointment = new Appointment();


        System.out.println("------------WELCOME---------- ");
        System.out.println("Chiuce the option");

        System.out.println("1 Lista dos pacientes \n" +
                "2 Ver os dados do medico\n" +
                "3 Ver os dados do paciente \n" +
                "4 Marcar a consulta\n" +
                "5 ver os dias disponives\n" +
                "6 Fechar");



        Scanner input = new Scanner(System.in);

        System.out.println("Faca a escolha");
        int choice = input.nextInt();

            switch (choice) {

                case 1:
                    appointment.appointmentList();
                    break;

                case 2:  System.out.println(doctor.info("Pedro", "Job", 15));

                   break;
                case 3 :
                    System.out.println(patient.info("Paulo", "Santos", 51));
                    break;

                case 4 : doctor.avail();




                            break;




            }




    }



}
