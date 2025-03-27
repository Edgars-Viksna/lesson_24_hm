public class PredicateStudentByLowRating implements PredicateStudent {


    @Override
    public boolean test(Student student) {
        return student.getRating()>1;
    }
}