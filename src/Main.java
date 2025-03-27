import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam", "White", "adam.white@gmail.com", "Group 1a"));
        studentList.add(new Student("Barby", "Black", "barby.black@gmail.com", "Group 1a"));
        studentList.add(new Student("Cecil", "Braun", "cecil.braun@gmail.com", "Group 22b"));
        studentList.add(new Student("Daniel", "Blue", "daniel.blue@gmail.com", "Group 22b"));
        studentList.add(new Student("Ervin", "Green", "ervin.green@gmail.com", "Group 3a"));

        System.out.println(" ------ home + class work -------");
        Student.homeWork(studentList, "Ervin", "Green");
        Student.homeWork(studentList, "Ervin", "Green");
        Student.homeWork(studentList, "Ervin", "Green");


        Student.classWork(studentList, "barby", "black");
        Student.classWork(studentList, "barby", "black");
        Student.classWork(studentList, "barby", "black");

        System.out.println(" ------- Print list -------");
        Students.print(studentList);

        System.out.println("------- sort by rating ----------");
        Collections.sort(studentList, Students.comparatorByRating());
        Students.print(studentList);

        System.out.println("-----sort by name -------");
        Collections.sort(studentList, Students.comparatorByLastName());
        Students.print(studentList);

        System.out.println("------- predicate ----------");

        System.out.println("------- predicate by rating----------");
        Students.print(Students.filter(studentList, new PredicateStudentByLowRating(1.0)));

        System.out.println("------- predicate by group----------");
        Students.print(Students.filter(studentList, new PredicateByGroup("group 22b")));

        System.out.println("------- check Student in the list----------");
        Students.checkStudent(studentList, "barby", "black");
        Students.checkStudent(studentList, "barby", "white");

        System.out.println("------- extractors ----------");
        printList(Students.extract(studentList, new ExtractorByFirstLastNameGroup()));
        printList(Students.extract(studentList, new ExtractByLastNameEmail()));


    }
    //-------------- Methods ---------------

    public static void printList(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

}