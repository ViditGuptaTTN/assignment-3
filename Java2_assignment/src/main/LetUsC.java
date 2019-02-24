package main;

public class LetUsC extends Book {
        int bookAvailable = 100,bookIssued =0;

    @Override
    public void bookIssue() {
        bookIssued++;
        bookAvailable--;
        System.out.println("Book is Issued");
        System.out.println("Books Availabe =" + bookAvailable);
        System.out.println("Books Issued =" + bookIssued);
    }

    @Override
    public void bookReturn() {
        bookIssued--;
        bookAvailable++;
        System.out.println("Book is Returned");
        System.out.println("Books Availabe =" + bookAvailable);
        System.out.println("Books Issued =" + bookIssued);
    }
}
