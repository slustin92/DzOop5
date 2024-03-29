package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StGrup;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final StudyGroupService groupService = new StudyGroupService();
    private final DataService dataService = new DataService();
    private  final StudentView studentView = new StudentView();
    private final StGrup studentView1 = new StGrup();



    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName,secondName,lastName,Type.STUDENT);
    }
    public void getAllStudent(){
        List<model.User> userList = dataService.getAllStedent();
        for(User user : userList)
            studentView.printOmConsole(user);

    }
    public List<User> allStudent(){
        List<User> userList = dataService.getAllStedent();

        return userList;
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName,secondName,lastName,Type.TEACHER);
    }


    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList)
            studentView.printOmConsole(user);
    }
    public Teacher allTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList)
            return (Teacher) user;
        return null;
    }

    public void getAllGrup(){

            List<StudyGroup> groups = groupService.getStyde(allTeacher(), allStudent());
            for (StudyGroup user : groups)
            studentView1.printOmConsole(user);

}









}
