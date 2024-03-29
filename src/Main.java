import controller.Controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("1", "1", "1");
        controller.createTeacher("Мария", "Сергеевна", "Петрова");
        controller.createStudent("2", "2", "2");
        controller.createStudent("3", "3", "3");
//        controller.createStudent("4", "4", "4");
//        controller.createStudent("5", "5", "4");

        controller.getAllGrup();

//        controller.getAllStudent();
//        controller.getAllTeacher();
////        System.out.println();
////        controller.getAllStudent();


    }
}