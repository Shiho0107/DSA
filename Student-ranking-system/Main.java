package org.example;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        // Adding students
        studentManagement.addStudent(new Student(1, "Alice", 95));
        studentManagement.addStudent(new Student(2, "Bob", 82));
        studentManagement.addStudent(new Student(3, "Charlie", 67));
        studentManagement.addStudent(new Student(4, "Diana", 54));
        studentManagement.addStudent(new Student(5, "Eve", 45));

        // Displaying students
        studentManagement.displayStudentsWithRanks();

        // Editing a student
        studentManagement.editStudent(3, "Charlie Updated", 75);

        // Deleting a student
        studentManagement.deleteStudent(5);

        // Sorting students by marks
        studentManagement.sortStudents();

        // Displaying sorted students
        System.out.println("\nSorted Students:");
        studentManagement.displayStudentsWithRanks();

        // Searching for a student
        Student searchedStudent = studentManagement.searchStudent(2);
        if (searchedStudent != null) {
            System.out.println("\nFound Student: " + searchedStudent);
        } else {
            System.out.println("\nStudent not found.");
        }
    }
}