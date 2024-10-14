/ Base class representing a person
class Person {
    protected String name; // Person's name
    protected int age;     // Person's age

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing a student
class Student extends Person {
    private String studentID;  // Student's ID
    private String course;      // Course enrolled
    private int units;          // Number of units
    private static final int FEE_PER_UNIT = 1000; // Fee per unit

    // Constructor to initialize student's fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call the constructor of the base class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate total fees for the student
    public double calculateFees() {
        return units * FEE_PER_UNIT;
    }

    // Override displayInfo to include student-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.printf("Student ID: %s, Course: %s, Units: %d, Total Fee: %.2f%n", 
                          studentID, course, units, calculateFees());
    }
}
// Subclass representing an instructor
class Instructor extends Person {
    private String employeeID; // Instructor's employee ID
    private String department;  // Department the instructor belongs to
    private double salary;      // Instructor's salary

    // Constructor to initialize instructor's fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call the constructor of the base class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo to include instructor-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.printf("Employee ID: %s, Department: %s, Salary: %.2f%n", 
     - h                     employeeID, department, salary);
    }
}
public class UniversityEnrollmentSystem {

    // Method to demonstrate polymorphism
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the appropriate displayInfo() method
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Pedro", 20, "S456", "Engineering Economics", 15);
        Student student2 = new Student("Emman", 22, "S489", "Data Structure", 12);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Ma'am Judy", 45, "E456", "Engineering Economics", 75000);
        Instructor instructor2 = new Instructor("Prof. Edgar", 50, "E457", "Data Structure", 85000);

        // Print information for each student
        System.out.println("Student Information:");
        printDetails(student1); // Calls displayInfo for student1
        printDetails(student2); // Calls displayInfo for student2

        // Print information for each instructor
        System.out.println("\nInstructor Information:");
        printDetails(instructor1); // Calls displayInfo for instructor1
        printDetails(instructor2); // Calls displayInfo for instructor2
    }
}