package main;

import java.util.Comparator;
import java.util.Objects;

public class Student{
    String Name;
    Double Score;
    Double Age;

    Student( String Name,Double Score,Double Age){
        this.Name = Name;
        this.Score = Score;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public Double getScore() {
        return Score;
    }

    public Double getAge() {
        return Age;
    }
}

