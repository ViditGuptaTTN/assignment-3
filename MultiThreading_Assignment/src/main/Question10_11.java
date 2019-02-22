package main;

public class Question10_11 {
    int count;

        synchronized public void incrementCount () {
        count++;
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
}
