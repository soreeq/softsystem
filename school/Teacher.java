package school;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<Group> groupsTaught;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupsTaught = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addGroupTaught(Group group) {
        groupsTaught.add(group);
    }

    public void editGroupTaught(Group oldGroup, Group newGroup) {
        int index = groupsTaught.indexOf(oldGroup);
        if (index != -1) {
            groupsTaught.set(index, newGroup);
        }
    }

    public void deleteGroupTaught(Group group) {
        groupsTaught.remove(group);
    }
}
