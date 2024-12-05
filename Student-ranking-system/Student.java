package org.example;

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getRank() {
        if (marks >= 9) {
            return "Excellent";
        } else if (marks >= 7.5) {
            return "Very Good";
        } else if (marks >= 6.5) {
            return "Good";
        } else if (marks >= 5) {
            return "Medium";
        } else {
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", status='" + getRank() + '\'' + // Include status in toString
                '}';
    }
}