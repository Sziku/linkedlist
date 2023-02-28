package org.example;

public class Student {
    private String namer;
    private int grade;
    private double avarage;

    public Student(String namer, int grade, double avarage) {
        this.namer = namer;
        this.grade = grade;
        this.avarage = avarage;
    }

    public String getNamer() {
        return namer;
    }

    public void setNamer(String namer) {
        this.namer = namer;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "namer='" + namer + '\'' +
                ", grade=" + grade +
                ", avarage=" + avarage +
                '}';
    }
}
