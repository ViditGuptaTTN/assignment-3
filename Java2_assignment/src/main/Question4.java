package main;

public class Question4 {

    private static Question4 singleton;
     String str;

    private Question4() {
        str = "to the new";
    }

    public static Question4 getInstance() {
        if (singleton == null) {
            singleton = new Question4();
        }
        return singleton;
    }
}