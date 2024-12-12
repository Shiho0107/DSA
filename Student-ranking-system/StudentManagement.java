package org.example;

import java.util.ArrayList;
import java.util.List;

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

    public void sortStudents() {
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
