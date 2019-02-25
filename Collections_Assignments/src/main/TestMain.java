package main;

import javax.print.DocFlavor;


import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import static java.util.Collections.frequency;

public class TestMain {

//Question1

/*
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter list elements");
        for(int i=0; i<10 ;i++)

            list.add(sc.nextInt());

        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        int sum =0;
        while(iterator.hasNext())
        {
            sum = sum + iterator.next();
        }
        System.out.println(sum);
    }
}

*/

//Question2

    /*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        HashSet<Character> ch = new HashSet<>();
        for(int i= 0; i<str.length();i++)
            ch.add(str.charAt(i));
        System.out.println(ch);
    }
}

*/
    //Question3
/*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        HashMap <Character,Integer> ch = new HashMap<>();

        for (char c:str.toCharArray()) {
            if(ch.containsKey(c)){
                ch.put(c,ch.get(c)+1);
            }else
                ch.put(c,1);
        }
        System.out.println(ch);
    }
}
*/

//Question4
/*
    public static void main(String[] args) {

        List<Employee> em = new ArrayList<>();
        em.add(new Employee(34.50, 2000.25, "Ajay"));
        em.add(new Employee(44.50, 3000.75, "Vijay"));
        em.add(new Employee(54.50, 78000.25, "Jay"));

        System.out.println("Sorting by Salary");

        Collections.sort(em, new SalaryComparator());
        for (Employee e : em) {
            System.out.println(" Age: " + e.Age + " Salary: " + e.Salary + " Name: " + e.Name);
        }
    }
}
*/

//Question5
/*
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student("Daj",52.43,43.50));
        st.add(new Student("Aaj",32.43,33.50));
        st.add(new Student("Bavi",52.43,23.50));

        System.out.println("Sorting by Salary & Name ");
        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compare = (int)(Double.compare(o1.Score,o2.Score));
                if (compare == 0){
                    compare = o1.Name.compareTo(o2.Name);
                }
                return compare;  }
        });
        Iterator<Student> iterator = st.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.getName()+" "+s.getScore());
        }
    }
}
 */

//Question6


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter elements");
        int arr[] = new int[10];
        for(int i=0; i<10 ;i++)
         arr[i] = sc.nextInt();

        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i:arr){
            if(a.containsKey(i))
                a.put(i,a.get(i)+1);
            else
                a.put(i,1);

            List<Map.Entry<Integer, Integer>> entries1=new ArrayList<>(a.entrySet());
            Collections.sort(entries1, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
            System.out.println(entries1);
    }
}
}

//Question7
/*
    public static void main(String[] args) {

        SpecialStack st = new SpecialStack();

        st.pushStack(st.s,23);
        st.pushStack(st.s,47);
        st.pushStack(st.s,73);
        st.pushStack(st.s,29);
        st.pushStack(st.s,85);

        System.out.println(st.s);

        System.out.println(st.isFull(st.s));

        System.out.println(st.minStack(st.s));

        st.popStack(st.s);

        System.out.println(st.s);

        st.popStack(st.s);
        st.popStack(st.s);
        st.popStack(st.s);
        st.popStack(st.s);

        System.out.println( st.isEmptyStack(st.s));
    }
}
*/

//Question8
/*
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date = new Date();
        System.out.println((dateFormat.format(date)));
    }
}
*/


//Question9
/*
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
        dateFormat.setTimeZone(TimeZone.getTimeZone("WET"));
        System.out.println(dateFormat.format(new Date()));
        dateFormat.setTimeZone(TimeZone.getTimeZone("EET"));
        System.out.println(dateFormat.format(new Date()));
        dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
        System.out.println(dateFormat.format(new Date()));
    }
}
*/