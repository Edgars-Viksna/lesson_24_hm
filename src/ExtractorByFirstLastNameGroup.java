public class ExtractorByFirstLastNameGroup implements Extractor {

    @Override
    public String extract(Student student) {

        String s = student.getFirstName() + " " + student.getLastName() + " ," + student.getGroup();

        return s;
    }
}
