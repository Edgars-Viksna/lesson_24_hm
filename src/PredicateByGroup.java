public class PredicateByGroup implements PredicateStudent {

    private String group;

    public PredicateByGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean test(Student student) {
        return student.getGroup().equalsIgnoreCase(group);
    }
}
