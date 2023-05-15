package school;

public class SchoolTest {
    public static void main(String[] args) {
        // Tworzenie obiektu School
        School school = new School("Freedom");

        // Tworzenie studentów
        Student davidRussell = new Student("David", "Russell");
        Student nicholasGrant = new Student("Nicholas", "Grant");
        Student emmaFletcher = new Student("Emma", "Fletcher");
        Student johnBrown = new Student("John", "Brown");
        Student emilyCooper = new Student("Emily", "Cooper");

        Student kevinSimmons = new Student("Kevin", "Simmons");
        Student ianHayes = new Student("Ian", "Hayes");

        Student jessicaCarter = new Student("Jessica", "Carter");
        Student andrewCooper = new Student("Andrew", "Cooper");
        Student ashleyMoore = new Student("Ashley", "Moore");
        Student oliviaAdams = new Student("Olivia", "Adams");
        Student jonathanSmith = new Student("Jonathan", "Smith");

        // Tworzenie obiektów nauczyciela
        Teacher tomJohnson = new Teacher("Tom", "Johnson");
        Teacher elizabethHall = new Teacher("Elizabeth", "Hall");

        // Dodawania nauczycieli do szkoły
        school.addTeacher(tomJohnson);
        school.addTeacher(elizabethHall);

        // Tworzenie grup
        Group englishGroup = new Group("English");
        Group frenchGroup = new Group("French");
        Group informaticsGroup = new Group("Informatics");

        // Dodawanie studentów do grup
        englishGroup.addStudent(davidRussell);
        englishGroup.addStudent(nicholasGrant);
        englishGroup.addStudent(emmaFletcher);
        englishGroup.addStudent(johnBrown);
        englishGroup.addStudent(emilyCooper);

        frenchGroup.addStudent(kevinSimmons);
        frenchGroup.addStudent(ianHayes);

        informaticsGroup.addStudent(jessicaCarter);
        informaticsGroup.addStudent(andrewCooper);
        informaticsGroup.addStudent(ashleyMoore);
        informaticsGroup.addStudent(oliviaAdams);
        informaticsGroup.addStudent(jonathanSmith);


        // Dodawanie grup do szkoły
        school.addGroup(englishGroup);
        school.addGroup(frenchGroup);
        school.addGroup(informaticsGroup);

        // Przypisywanie nauczycieli do poszczególnych grup
        englishGroup.changeTeacher(elizabethHall);
        frenchGroup.changeTeacher(elizabethHall);
        informaticsGroup.changeTeacher(tomJohnson);


        // Wypisywanie informacji o szkole
        school.printSchool();
    }
}

