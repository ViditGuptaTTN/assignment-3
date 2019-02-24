package main;

public interface Library {
    public void bookIssue();
    public void bookReturn();
}
 abstract class Book implements Library{
    int bookIssued=0, bookAvailable=0;

     @Override
     public void bookIssue() {
         System.out.println("Book is Issued");
         bookIssued++;
         bookAvailable--;
     }

     @Override
     public void bookReturn() {
         System.out.println("Book is Returned");
             bookIssued--;
             bookAvailable++;
         }
     }
