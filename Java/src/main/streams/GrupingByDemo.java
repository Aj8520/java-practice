package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class GrupingByDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("ajay", "IT", 500), new Employee("poonam", "HR", 100),
                new Employee("panoti", "HR", 1500), new Employee("mansvi", "IT", 2000),
                new Employee("jatari", "Finance", 5000));
        // grup employee by department
        Map<String, List<Employee>> employwithdepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        // print the gruped item
        employwithdepartment.forEach((department, employeelist) -> {
            System.out.println("department " + department);
            employeelist.forEach(System.out::println);

        });
    }

}
