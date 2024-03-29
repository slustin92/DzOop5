package model;

import java.util.List;

public class StudyGroup  {

    public List<User> studentList;
    public Teacher teacher ;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;

    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                ",teacher= " + teacher + "\n" +
                " studentList= " + studentList +

                '}';
    }
}
