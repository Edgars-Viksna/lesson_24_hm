import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam", "White", "adam.white@gmail.com", "Group 1a"));
        studentList.add(new Student("Barby", "Black", "barby.black@gmail.com", "Group 1a"));
        studentList.add(new Student("Cecil", "Braun", "cecil.braun@gmail.com", "Group 1a"));
        studentList.add(new Student("Daniel", "Blue", "daniel.blue@gmail.com", "Group 1a"));
        studentList.add(new Student("Ervin", "Green", "ervin.green@gmail.com", "Group 1a"));

        System.out.println(" ------ home, class work -------");

        Student.homeWork(studentList, "Ervin", "Green");
        Student.classWork(studentList, "barby", "black");

        System.out.println(" ------- Print list -------");
        Students.printStudents(studentList);


    }
    //-------------- Methods ---------------


}