package School;

import java.util.ArrayList;

public class Classroom implements Displayable {
    private int roomNumber;
    private Displayable teacher;
    private ArrayList<Displayable> students;

    // No-argument constructor
    public Classroom() {
        students = new ArrayList<>();
    }

    // Constructor with parameters
    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    // Getter and Setter methods for roomNumber
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter and Setter methods for teacher
    public Displayable getTeacher() {
        return teacher;
    }

    public void setTeacher(Displayable teacher) {
        this.teacher = teacher;
    }

    // Getter and Setter methods for students
    public ArrayList<Displayable> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Displayable> students) {
        this.students = students;
    }

    // Override the display() method
    @Override
    public String display() {
        StringBuilder displayString = new StringBuilder();
        displayString.append("Room Number: ").append(roomNumber).append("\n");
        displayString.append("Teacher: ").append(teacher.display()).append("\n");
        displayString.append("Students:\n");
        for (Displayable student : students) {
            displayString.append(student.display
