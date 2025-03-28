import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Students {

    private Students() {
    }

    public static void print(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static Comparator<Student> comparatorByRating() {
        Comparator<Student> comparator = new SortByRating();
        return comparator;
    }

    public static Comparator<Student> comparatorByLastName() {
        Comparator<Student> comparator = new SortByLastName();
        return comparator;
    }

    public static List<Student> filter(List<Student> list, PredicateStudent predicat) {
        List<Student> result1 = new ArrayList<>();
        for (Student student : list) {
            if (predicat.test(student)) {
                result1.add(student);
            }
        }
        return result1;
    }

    public static void checkStudent(List<Student> list, String firstName, String lastName) {
        boolean found = false;
        for (Student student : list) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)) {
                found = true;
                System.out.println("This list contain student: " + student);
                break;
            }
        }
        if (found == false) {
            System.out.println("This list does not contain student: " + firstName + " " + lastName);
        }
    }

    public static List<String> extract(List<Student> list, Extractor extractor) {
        List<String> result = new ArrayList<>();
        for (Student student : list) {
            result.add(extractor.extract(student));
        }
        return result;
    }

    public static List<Student> mergeTwoLists(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>(list1);
        for (Student student : list2) {
            result.add(student);
        }
        return result;
    }


}



