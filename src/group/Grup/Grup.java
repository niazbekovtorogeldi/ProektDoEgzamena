package group.Grup;

import lesson.Lesson;
import person.Person;

import java.util.List;

public class Grup {
    private int idGrup;
    private String groupNameGrup;
    private String descripshionGrup;
    private List<Lesson> lessonsGruup;
    private List<Person> studentGrup;

    public Grup(int idGrup, String groupNameGrup, String descripshionGrup, List<Lesson> lessonsGruup, List<Person> studentGrup) {
        this.idGrup = idGrup;
        this.groupNameGrup = groupNameGrup;
        this.descripshionGrup = descripshionGrup;
        this.lessonsGruup = lessonsGruup;
        this.studentGrup = studentGrup;
    }

    public int getIdGrup() {
        return idGrup;
    }

    public void setIdGrup(int idGrup) {
        this.idGrup = idGrup;
    }

    public String getGroupNameGrup() {
        return groupNameGrup;
    }

    public void setGroupNameGrup(String groupNameGrup) {
        this.groupNameGrup = groupNameGrup;
    }

    public String getDescripshionGrup() {
        return descripshionGrup;
    }

    public void setDescripshionGrup(String descripshionGrup) {
        this.descripshionGrup = descripshionGrup;
    }

    public List<Lesson> getLessonsGruup() {
        return lessonsGruup;
    }

    public void setLessonsGruup(List<Lesson> lessonsGruup) {
        this.lessonsGruup = lessonsGruup;
    }

    public List<Person> getStudentGrup() {
        return studentGrup;
    }

    public void setStudentGrup(List<Person> studentGrup) {
        this.studentGrup = studentGrup;
    }

    @Override
    public String toString() {
        return "Grup{" +
                "\nidGrup=" + idGrup +
                "\ngroupNameGrup='" + groupNameGrup +
                "\ndescripshionGrup='" + descripshionGrup +
                "\nlessonsGruup=" + lessonsGruup +
                "\nstudentGrup=" + studentGrup ;
    }
}

