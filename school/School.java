package school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers;
    private List<Group> groups;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(Teacher teacher) {
        // Find the teacher in the list and update their details
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).equals(teacher)) {
                teachers.set(i, teacher);
                break;
            }
        }
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void editGroup(Group group) {
        // Find the group in the list and update its details
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).equals(group)) {
                groups.set(i, group);
                break;
            }
        }
    }

    public void deleteGroup(Group group) {
        groups.remove(group);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(Student student) {
        // Find the student in the list and update their details
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) {
                students.set(i, student);
                break;
            }
        }
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public void printSchool() {
        System.out.println("School: " + name);
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullName());
        }
        System.out.println("Groups:");
        for (Group group : groups) {
            System.out.println(group.getName() + " (Teacher: " + group.getTeacher().getFullName() + ")");
            System.out.println("Students:");
            for (Student student : group.getStudents()) {
                System.out.println(student.getFullName());
            }
        }
    }
}
