import Impl.ImplimentMetod;
import exseption.GmailException;
import group.Grup.Grup;
import person.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        int hous = now.getHour();
        int minuten = now.getMinute();
        int second = now.getSecond();
        System.out.println("Текущее время:" + hous + ":" + minuten + ":" + second);
        ImplimentMetod implimentMetod = new ImplimentMetod();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Акаунтка кируу учун gmail ды жазыныз");
        String a = scanner.nextLine();






            if (a.contains("@")) {
            } else {
                throw new GmailException(" у вас нету в gmaile знака @");
            }
            System.out.println("теперь пароль ");
            int a1 = scanner.nextInt();
            if (a1 == 1234) {
            } else {
                throw new RuntimeException("пароль туура эмес");



        }


        System.out.println(">>>>>Кош келиниз<<<<<");
        while (true) {
            System.out.println("     Бир команда танданыз:" +
                    "\n1-> Создать новую группу" +
                    "\n2-> Получить группу по имени" +
                    "\n3-> Обновить имя группы" +
                    "\n4-> Получть все группы" +
                    "\n5-> Добавить нового ученика в группу" +
                    "\n6-> Обновить студента " +
                    "\n7-> Найти ученика по имени" +
                    "\n8-> Получить студента по группу" +
                    "\n9-> Получить все уроки ученика" +
                    "\n10->Удалить ученика из группы" +
                    "\n11->Добавить новый урок в группу" +
                    "\n12->Получить урок по имени" +
                    "\n13->Получить все уроки по имени" +
                    "\n14->Удалить урок из группы" +
                    "\n15->Удалить группу");

            int num = new Scanner(System.in).nextInt();

            switch (num) {


                case 1:
                    implimentMetod.DopavlenieNovogoGrup1();
                    break;
                case 2:
                    implimentMetod.PolucbitGrupPoImeni2();
                    break;
                case 3:
                    implimentMetod.ObnovitIma3();
                    break;
                case 4:
                    implimentMetod.PolychenieVseGrup4();
                    break;
                case 5:
                    implimentMetod.DobavitNovogoYchenikaVgrupu5();
                    break;
                case 6:
                    implimentMetod.ObnovitStidenta6();
                    break;
                case 7:
                    implimentMetod.NaitiYchenikaPoImeni7();
                    break;
                case 8:
                    implimentMetod.PoluchitVsehStudentovPoImeniGrupy8();
                    break;
                case 9:
                    implimentMetod.PoluchitVseUroki9();
                    break;
                case 10:
                    implimentMetod.YdalitYchenikaIzGrupy10();
                    break;
                case 11:
                    implimentMetod.DobavitNewUrokVgruppy11();
                    break;
                case 12:
                    implimentMetod.PoluchitUrokPoImeni12();
                    break;
                case 13:
                    implimentMetod.PoluchitVseUrokiPoImeni13();
                    break;
                case 14:
                    implimentMetod.DeleteUrokIzGruppy();

                case 15:
                    implimentMetod.DeleteGrup();
                    break;
                default:
                    System.out.println("Error");
                    break;

            }
        }
    }

}






