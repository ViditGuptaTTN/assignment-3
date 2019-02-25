package main;

import java.util.Comparator;

public class Employee {
    Double Age;
    Double Salary;
    String Name;
    Employee(Double Age,Double Salary,String Name){
        this.Age=Age;
        this.Salary=Salary;
        this.Name=Name;
    }
}
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        if (e1.Salary == e2.Salary)
                return 0;
        else if(e1.Salary < e2.Salary)
            return 1;
        else
            return -1;
    }
}

