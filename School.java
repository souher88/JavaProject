package school;

public class Student extends Person implements Displayable {
    private int studentId;
    private int finalGrade;

    // Constructor
    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.finalGrade = finalGrade;
    }

    // Getter and Setter methods for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter methods for finalGrade
    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    // Override the display() method
    @Override
    public String display() {
        return "Student ID: " + studentId + "\t" +
                getFullName() + " Final Grade: " + finalGrade;
    }
}
