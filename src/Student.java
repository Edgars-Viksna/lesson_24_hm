import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String group;
    private double rating;

    public Student(String firstName, String lastName, String email, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.group = group;
        this.rating = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                " firstName='" + firstName + '\'' +
                " lastName='" + lastName + '\'' +
                " email='" + email + '\'' +
                " group='" + group + '\'' +
                " rating=" + rating +
                '}';
    }

    public static void homeWork(List<Student> list, String firstName, String lastName) {
        for (Student student : list) {
            if (student.getFirstName().equalsIgnoreCase(firstName) &&
                    student.getLastName().equalsIgnoreCase(lastName)) {
                student.setRating(student.getRating() + 0.5);
            }
        }
    }

    public static void classWork(List<Student> list, String firstName, String lastName) {
        for (Student student : list) {
            if (student.getFirstName().equalsIgnoreCase(firstName) &&
                    student.getLastName().equalsIgnoreCase(lastName)) {
                student.setRating(student.getRating() + 0.8);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
