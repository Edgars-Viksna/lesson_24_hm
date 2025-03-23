import java.util.List;

public class Students {

    private Students() {
    }

    public static void printStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }


}
