package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentManagement {
    private StudentStack studentStack;
    private List<Student> studentList;

    public StudentManagement() {
        studentStack = new StudentStack();
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentStack.push(student);
        studentList.add(student);
        System.out.println("Added student: " + student);
    }

    public void editStudent(int id, String name, int marks) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.set(i, new Student(id, name, marks));
                System.out.println("Student edited: " + id);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted with ID: " + id);
    }

    public void generateRandomStudents(int numberOfStudents) {
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            int id = random.nextInt(10000);
            String name = "Student" + (i + 1); // Generating a simple name
            double marks = random.nextInt(101);   // Random marks between 0 and 100
            studentList.add(new Student(id, name, marks));
        }
    }

    public void sortStudents(List<Student> studentList) {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getMarks() < studentList.get(j + 1).getMarks()) {
                    // Swap
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Students sorted by marks.");
    }
    public void sortStudents() {
    }

    public void mergeSortByName(List<Student> studentList) {
        if (studentList.size() < 2) {
            return;
        }
        int mid = studentList.size() / 2;

        List<Student> leftHalf = new ArrayList<>(studentList.subList(0, mid));
        List<Student> rightHalf = new ArrayList<>(studentList.subList(mid, studentList.size()));

        mergeSortByName(leftHalf);
        mergeSortByName(rightHalf);

        mergeByName(studentList, leftHalf, rightHalf);
    }

    private void mergeByName(List<Student> studentList, List<Student> leftHalf, List<Student> rightHalf) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.size() && j < rightHalf.size()) {
            if (leftHalf.get(i).getName().compareTo(rightHalf.get(j).getName()) <= 0) {
                studentList.set(k++, leftHalf.get(i++));
            } else {
                studentList.set(k++, rightHalf.get(j++));
            }
        }

        while (i < leftHalf.size()) {
            studentList.set(k++, leftHalf.get(i++));
        }

        while (j < rightHalf.size()) {
            studentList.set(k++, rightHalf.get(j++));
        }
    }

    public void sortStudentsByNames() {
        mergeSortByName(studentList);
    }

    public void compareSortTimes() {
        // Create a copy of the original student list for fair comparison
        List<Student> originalListByMarks = new ArrayList<>(studentList);
        List<Student> originalListByName = new ArrayList<>(studentList);

        // Measure time for Bubblesort
        long startTime = System.nanoTime();
        sortStudents(studentList);
        long endTime = System.nanoTime();
        long durationByMarks = endTime - startTime;

        // Measure time for Mergesort
        startTime = System.nanoTime();
        mergeSortByName(studentList);
        endTime = System.nanoTime();
        long durationByName = endTime - startTime;

        // Display the results
        System.out.printf("Time taken to sort by marks(bubblesort): %d ns%n", durationByMarks);
        System.out.printf("Time taken to sort by names(mergesort): %d ns%n", durationByName);
    }


    public Student searchStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Not found
    }

    public void displayStudentsWithRanks() {
        System.out.println("Students with Ranks:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
