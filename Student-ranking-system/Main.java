
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

        // Displaying students
        studentManagement.displayStudentsWithRanks();

        // Deleting a student
        studentManagement.deleteStudent(5);

        // Displaying students
        studentManagement.displayStudentsWithRanks();

        // Sorting students by marks using Bubble sort
        studentManagement.sortStudents();

        // Displaying sorted students by marks
        System.out.println("\nSorted Students by marks:");
        studentManagement.displayStudentsWithRanks();

        // Sort students by names using merge sort
        studentManagement.sortStudentsByNames();

        // Display sorted students by name
        System.out.println("\nSorted Students by name:");
        studentManagement.displayStudentsWithRanks();

        // Searching for a student
        Student searchedStudent = studentManagement.searchStudent(2);
        if (searchedStudent != null) {
            System.out.println("\nFound Student: " + searchedStudent);
        } else {
            System.out.println("\nStudent not found.");
        }

        // Generate random students
        int numberOfStudents = 10000;
        studentManagement.generateRandomStudents(numberOfStudents);

        studentManagement.compareSortTimes();
    }
}
