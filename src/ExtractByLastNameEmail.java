public class ExtractByLastNameEmail implements Extractor {
    @Override
    public String extract(Student student) {
        String s = student.getLastName() + " - " + student.getEmail();
        return s;
    }
}
