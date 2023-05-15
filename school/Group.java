package school;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void changeTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addGroupTaught(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(Student oldStudent, Student newStudent) {
        int index = students.indexOf(oldStudent);
        if (index != -1) {
            students.set(index, newStudent);
        }
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
