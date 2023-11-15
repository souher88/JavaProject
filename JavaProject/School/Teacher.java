package school;

public class Teacher extends Person implements Displayable {
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    // Getter and Setter method for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String display() {
        return getFullName() + " teaches " + subject + ".";
    }
}
