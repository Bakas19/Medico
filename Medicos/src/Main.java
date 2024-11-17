import datas.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {




        Doctor doctor =  new Doctor();
        Patient patient = new Patient("Paulo","Mikoko", 54,  Gender.MALE, "maul");
        Appointment appointment = new Appointment();


        System.out.println("------------WELCOME---------- ");
        System.out.println("Выберите вариант");

        System.out.println("1 Список пациентов \n" +
                "2 Просмотр данных врача\n" +
                "3 Просмотр информации о пациенте \n" +
                "4 Записаться на прием\n"

                );



        Scanner input = new Scanner(System.in);

        System.out.println("Faca a escolha");
        int choice = input.nextInt();

            switch (choice) {

                case 1:
                    appointment.appointmentList();
                    break;

                case 2:
                    System.out.println(patient.detail(new Disease("Головная боль", "Серьезное состояние "), "Паулу", "Бака", 54));

                   break;
                case 3 :
                    System.out.println(patient.info("Paulo", "Santos", 51));
                    break;

                case 4 : doctor.avail();




                            break;




            }




    }



}
