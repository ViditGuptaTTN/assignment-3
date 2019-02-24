package main;

public class Question5 implements Cloneable {
    int rollno;
    String name;

    Question5(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
