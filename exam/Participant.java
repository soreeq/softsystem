package exam;


class Participant {
    private String firstName;
    private String lastName;
    private int[] points;

    public Participant(String firstName, String lastName, int[] points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalPoints() {
        int total = 0;
        for (int point : points) {
            total += point;
        }
        return total;
    }

    public String getResult() {
        int totalPoints = getTotalPoints();
        if (totalPoints > 50) {
            return firstName + " " + lastName + " gained " + totalPoints + " points and passed the exam.";
        } else {
            return firstName + " " + lastName + " gained " + totalPoints + " points and did not pass the exam.";
        }
    }
}