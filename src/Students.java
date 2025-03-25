import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {

    private Students() {
    }

    public static void print (List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static Comparator<Student> comparatorByRating (){
        Comparator<Student> comparator = new SortByRating();
        return comparator;
    }

public static Comparator<Student> comparatorByLastName (){
        Comparator <Student> comparator = new SortByLastName();
        return comparator;
}
        


}



