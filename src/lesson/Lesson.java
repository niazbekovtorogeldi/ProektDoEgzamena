package lesson;

import java.util.List;

public class Lesson {
   private int id;
   private String lessonName;
   private String discripshin;

    public Lesson(int id, String lessonName, String discripshin) {
        this.id = id;
        this.lessonName = lessonName;
        this.discripshin = discripshin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDiscripshin() {
        return discripshin;
    }

    public void setDiscripshin(String discripshin) {
        this.discripshin = discripshin;
    }

    @Override
    public String toString() {
        return "Lesson" +
                "\nid=" + id +
                "\nlessonName='" + lessonName  +
                "\ndiscripshin='" + discripshin  ;
    }
}
