package service;

import model.Student;
import model.Teacher;
import model.StudyGroup;
import model.User;
import service.DataService;
import java.util.ArrayList;
import java.util.List;

public class StudyGroupService{
    private List<StudyGroup> studyGroups = new ArrayList<>();

    public List<StudyGroup> getStyde(Teacher teacher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.setStudentList(studentList);
        studyGroup.setTeacher(teacher);
        studyGroups.add(studyGroup);
    return studyGroups;
    }


}
