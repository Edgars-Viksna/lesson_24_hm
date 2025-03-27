public class PredicateStudentByLowRating implements PredicateStudent {

    private Double rating;

    public PredicateStudentByLowRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean test(Student student) {
        return student.getRating() >= rating;
    }
}