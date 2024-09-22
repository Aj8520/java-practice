package main.equalesANDhashcode;

import java.util.*;

/*
 * If two objects are equal, they must have the same hash code.
*If two objects have the same hash code, it does not necessarily mean they are equal.
*Overriding the equals() method alone would fail with hashing data structures like Map, Set, etc.
*Overriding the hashCode() method alone would not help in comparing objects.
 */

public class JavaEqualsHashCodeContract {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alex", 20000.0);
        Employee e2 = new Employee("Alex", 20000.0);

        System.out.println(e1.equals(e2));

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println("Contents of set: " + set);

        System.out.println("Employee 1 hashcode : " + e1.hashCode());
        System.out.println("Employee 2 hashcode: " + e2.hashCode());
    }

}

class Employee {

    String name;
    Double salary;

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);

    }

    // @Override
    // public int hashCode() {
    // return Objects.hash(name, salary);
    // }

}
