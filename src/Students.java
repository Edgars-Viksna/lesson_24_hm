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


}



