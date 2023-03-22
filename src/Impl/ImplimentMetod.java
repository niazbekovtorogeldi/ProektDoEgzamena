package Impl;

import Enam.Gender;
import exseption.GmailException;
import group.Grup.Grup;
import lesson.Lesson;
import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;

public class ImplimentMetod implements Metod {

    ArrayList<Grup> words = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Lesson> lessons = new ArrayList<>();

private static int counter;
    @Override
    public void DopavlenieNovogoGrup1() {



        Scanner in = new Scanner(System.in);
        System.out.println("Группанын атын жазыныз: ");
        String groupName = in.nextLine();
        System.out.println("Группанын суроттомосун жазыныз: ");
        String description = in.nextLine();
        Grup group = new Grup(++counter, groupName, description, lessons, people);
//        System.out.println(group);
        words.add(group);
    }


    @Override
    public void PolucbitGrupPoImeni2() {
        try {
            System.out.println("Введите название группы:");
            String name = new Scanner(System.in).nextLine();
            boolean foundGroup = false;

            for (Grup a : words) {
                if (a.getGroupNameGrup().equals(name)) {
                    System.out.println(a);
                    foundGroup = true;
                    break;
                }
            }

            if (!foundGroup) {
                throw new Exception("Группа с таким названием не найдена.");
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

    }

    @Override
    public void ObnovitIma3() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите название группы:");
            String name = scanner.nextLine();
            System.out.println("Введите новое название группы:");
            String newName = scanner.nextLine();

            boolean foundGroup = false;
            for (Grup a : words) {
                if (a.getGroupNameGrup().equals(name)) {
                    a.setGroupNameGrup(newName);
                    foundGroup = true;
                    break;
                }
            }

            if (foundGroup) {
                System.out.println("Название группы изменено успешно.");
            } else {
                System.out.println("Группа с таким названием не найдена.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    @Override
    public void PolychenieVseGrup4() {


    System.out.println(words);
}



        @Override
        public void DobavitNovogoYchenikaVgrupu5 () {

            try {


                Scanner scanner = new Scanner(System.in);
                System.out.println("кайсы группага кошкунуз келсе ошону жазыныз");
                String nam = new Scanner(System.in).nextLine();

                System.out.println("жаны студенти кошу учун  атын жазыныз");
                String name = scanner.nextLine();
                System.out.println("фамилиясын жазыныз:");
                String name1 = scanner.nextLine();


                    System.out.println("gmail ды жазыныз:");
                    String s = scanner.nextLine();
                    if (s.contains("@")) {

                    } else {
                        System.out.println("У вас нет знака @ в адресе электронной почты.");
                    }

                System.out.println("пароль жазыныз:");
                String b = scanner.nextLine();
                System.out.println("gender:");
                String o = scanner.nextLine();
                Person person = new Person(1, name, name1, s, b, Gender.MALE);
              int id=0;
                for (Grup grup : words) {
                        if (grup.getGroupNameGrup().equalsIgnoreCase(nam)) {
                            id= grup.getIdGrup();
                        }
                    }
                boolean isFalse=false;
                for (Grup a:words) {
                    if (a.getIdGrup()==id){
                        isFalse=false;
                        System.out.println(a.getIdGrup());
                        System.out.println(id);
                        a.getStudentGrup().add(person);
                    }else {
                        isFalse=true;
                    }
                }
                if (isFalse){
                    System.out.println("Mynday gruppa tabylgan jok");
                }else {
                    System.out.println(person);
                }





                    }catch (Exception e) {
                System.out.println(e.getMessage());
                }
            }




        @Override
        public void ObnovitStidenta6 () {


            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("кайсы студенттин озгорткунуз келсе ошонун gmail жазыныз:");
                String gmail = scanner.nextLine();
                int index = -1;
                for (int i = 0; i < people.size(); i++) {
                    if (people.get(i).getGmailPerson().equals(gmail)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    throw new RuntimeException("мындай студент жок");
                }
                System.out.println("жаны ат жазыныз");
                String newName = scanner.nextLine();
                System.out.println("жаны фамилтие жазыныз:");
                String newSurname = scanner.nextLine();
                people.get(index).setFirstNamePerson(newName);
                people.get(index).setLastNAmePerson(newSurname);
                System.out.println(people);
                System.out.println("ийгиликту озгорулду.");


            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

        @Override
        public void NaitiYchenikaPoImeni7 () {
            Scanner scanner = new Scanner(System.in);

//
            try {
                System.out.println("Введите адрес электронной почты ученика:");
                String email = new Scanner(System.in).nextLine();
                boolean foundStudent = false;

                for (Grup group : words) {
                    for (Person person:people) {
                        if (person.getGmailPerson().equalsIgnoreCase(email)) {
                            foundStudent = true;
                            System.out.println(foundStudent);
                        }
                    }
                }

                if (!foundStudent) {
                    throw new RuntimeException("Ученик с таким адресом электронной почты не найден.");
                }

            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }


        }

        @Override
        public void PoluchitVsehStudentovPoImeniGrupy8 () {

            try {
                System.out.println("Введите название группы:");
                String groupName = new Scanner(System.in).nextLine();

                boolean foundGroup = false;
                for (Grup group : words) {
                    if (group.getGroupNameGrup().equalsIgnoreCase(groupName)) {
                        foundGroup = true;

                        if (people.isEmpty()) {
                            System.out.println("В этой группе нет студентов");
                        } else {
                            System.out.println("Студенты группы " + groupName + ":");
                            for (Person student : people) {
                                System.out.println(student);
                            }
                        }
                        break;
                    }
                }

                if (!foundGroup) {
                    throw new RuntimeException("Группа не найдена");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }


        @Override
        public void PoluchitVseUroki9 () {

            System.out.println(lessons);

        }


        @Override
        public void YdalitYchenikaIzGrupy10 () {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("студеннти очуру учун gmailin жазыныз");
                String s = new Scanner(System.in).nextLine();
                for (Person p : people) {
                    for (Grup g : words) {
                        if (p.getGmailPerson().equals(s)) {
                            words.remove(p);


                            System.out.println("вы успешно удалили");
                        } else {
                            System.out.println("такой gmail нету");
                        }

                    }
                }
            } catch (RuntimeException a) {
                System.out.println(a.getMessage());
            }

        }

        @Override
        public void DobavitNewUrokVgruppy11 () {

            try {
                System.out.println("группанын атын жазыныз");
                String string = new Scanner(System.in).nextLine();
                System.out.println("сабактын атын жазыныз");
                String string1 = new Scanner(System.in).nextLine();
                System.out.println("сабактын суроттомосун жазыныз");
                String string2 = new Scanner(System.in).nextLine();
                lessons.add(new Lesson(+1, string1, string2));
                System.out.println(lessons);
                for (Lesson lesson : lessons) {
                    for (Grup grup : words) {
                        if (grup.getGroupNameGrup().equalsIgnoreCase(string)) {
                            grup.getLessonsGruup().add(lesson);
                            System.out.println(lesson);
                        } else {
                            throw new Exception("мындай группа жок");
                        }
                    }
                }
                }catch (Exception a) {
                System.out.println(a.getMessage());
            }

        }

        @Override
        public void PoluchitUrokPoImeni12 () {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("сабактын атын жазыныз");
                String a = new Scanner(System.in).nextLine();
                for (Lesson lesson : lessons) {
                    if (lesson.getLessonName().equals(a)) {
                        System.out.println(lesson);
                    } else {
                        throw new RuntimeException("мындай сабак табылгын жок");
                    }
                }
            } catch (RuntimeException a) {
                System.out.println(a.getMessage());
            }

        }

        @Override
        public void PoluchitVseUrokiPoImeni13 () {

            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите название группы:");
                String name = scanner.nextLine();
                for (Grup grup : words) {
                    if (grup.getGroupNameGrup().equalsIgnoreCase(name)) {
                        System.out.println("Уроки для группы " + grup.getGroupNameGrup() + ":");
                        for (Lesson lesson : grup.getLessonsGruup()) {
                            System.out.println(lesson.getLessonName());
                        }
                        break; // stop searching after the first match
                    }
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        @Override
        public void DeleteUrokIzGruppy () {

            try {
                System.out.println("Сабактын атын жазыныз: ");
                String lessonName = new Scanner(System.in).nextLine();
                for (Grup a : words) {
                    for (Lesson b : a.getLessonsGruup()) {
                        if (b.getLessonName().equalsIgnoreCase(lessonName)) {
                            System.out.println(" Cабак ийгиликтуу очурулду");
                            a.getLessonsGruup().remove(b);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public void DeleteGrup () {


            try {
                int id = 0;
                System.out.println("Группанын атын жазыныз:");
                String groupName = new Scanner(System.in).nextLine();

                for (int i = 0; i < words.size(); i++) {
                    if (words.get(i).getGroupNameGrup().equalsIgnoreCase(groupName)) {
                        id = words.get(i).getIdGrup();
                    }
                }
                for (int j = 0; j < words.size(); j++) {
                    if (words.get(j).getIdGrup() == id) {
                        words.remove(words.get(j));
                    } else {
                        throw new RuntimeException("группа табылган жок");
                    }
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }

