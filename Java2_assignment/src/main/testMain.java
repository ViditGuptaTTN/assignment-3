package main;

import java.util.Scanner;

public class testMain {

    //Question1

    public static void main(String[] args) {
        
        Book luc = new LetUsC();

        luc.bookIssue();

        luc.bookReturn();
    }

}
    //Question2
/*
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Question2 q= new Question2();
        System.out.println("Enter the string");
        q.getSortedString(sc.nextLine());
    }
}
*/

    //Question3
/*
    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
 */

//Question4
/*
   public static void main(String[] args) {

       Question4 ob1=Question4.getInstance();
       System.out.println(ob1.str);
       System.out.println(Question4.getInstance());
        }
    }
*/


//Question5
 /*
    public static void main(String[] args) {
        try{
            Question5 s1=new Question5(101,"amit");
            Question5 s2=(Question5)s1.clone();
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
        }catch(CloneNotSupportedException c){}
    }
}
*/
/*
    public static void main(String[] args) {
        Question5copy p1 = new Question5copy(1, 2);
        Question5copy p2 = new Question5copy(p1);
        System.out.println(p1.x + " " + p1.y);
        System.out.println(p2.x + " " + p2.y);
    }
}
*/


    //Question6

  /*
    public static void main(String[] args) {
       Question6 q = new Question6();
    }
    */

//Question7

/*
    public static void main(String[] args) {

        Question7 ob = new Question7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Seconds To Convert");
        ob.ConvertSeconds(sc.nextInt());
    }
}

*/

//Question8
/*
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter string and check whether first and last char is equal or not till done");
            String s1 = s.nextLine();
            if (s1.equals("done")) {
                flag = false;
            }
            else if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
                System.out.println(" char are equal");
            }
        }
    }
}
*/
/*
    //Question9
    public static void main(String[] args) {

        Furniture f1=new WoodenChair();
        f1.fireTest();
        f1.stressTest();
        Furniture f2=new WoodenTable();
        f2.fireTest();
        f2.stressTest();

        Furniture f3=new MetalChair();
        f3.fireTest();
        f3.stressTest();
        Furniture f4=new MetalTable();
        f4.fireTest();
        f4.stressTest();
    }
}
*/

//Question10
/*
    public static void main(String[] args) {

        Cafeteria Q10=new Cafeteria();
        int tNumber=Q10.requestService();
        System.out.println("Your token number(order number) is: "+tNumber);
        Q10.processOrder();
        Q10.deliverService();
    }
}

*/










//Question11

/*
    public static void main(String[] args) {


        int s = 0;
        int t = 1;

        int i = 0;
        while (i < 10) {

            s = s + i;

            int j = i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);

    }
}

*/

//Question12
/*
    public static void main(String[] args) {
        Grandparent gp=new Child();
    }
}
*/
/*
Output

static - grandparent
static - parent
static - child
instance - grandparent
constructor - grandparent
instance - parent
constructor - parent
instance - child
constructor - child

*/

//Question13

/*
import java.lang.RuntimeException;

class SponsoredException extends RuntimeException {
@Override
public synchronized Throwable fillInStackTrace() {
setStackTrace(new StackTraceElement[]{
new StackTraceElement("ADVERTISEMENT", " If you don't ", null, 0),
new StackTraceElement("ADVERTISEMENT", " want to see this ", null, 0),
new StackTraceElement("ADVERTISEMENT", " exception ", null, 0),
new StackTraceElement("ADVERTISEMENT", " please buy ", null, 0),
new StackTraceElement("ADVERTISEMENT", " full version ", null, 0),
new StackTraceElement("ADVERTISEMENT", " of the program ", null, 0)
});
return this;
}
}
public class SupressStackTrace extends RuntimeException {
public SupressStackTrace() {
super("Catch me if you can");
}
@Override
public synchronized Throwable fillInStackTrace() {
return this;
}
}

 */
