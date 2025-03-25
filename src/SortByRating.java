import java.util.Comparator;
import java.util.List;

public class SortByRating implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
       return Double.compare(o1.getRating(), o2.getRating());
    }


}
