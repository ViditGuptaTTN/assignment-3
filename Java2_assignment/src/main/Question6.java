package main;

public class Question6 {
    static {
        try {
            int x = 0;
            int y = 4;
            int z = (y / x);
            Class.forName("adaa");
        } catch (ArithmeticException ae){
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("Other exception");
        }
    }
}
