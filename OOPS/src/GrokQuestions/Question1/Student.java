package GrokQuestions.Question1;

public class Student {
    int rno;
    String name;
    char grade;

    Student() {
        this.rno = 0;
        this.name = "Unknown";
        this.grade = 'F';
    }

    Student(int rno, String name, char grade) {
        this.rno = rno;
        this.name = name;
        this.grade = grade;
    }

    void showInfo() {
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.grade);
    }
}
