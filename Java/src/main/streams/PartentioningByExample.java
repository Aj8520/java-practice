package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class PartentioningByExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("ajay", "IT", 50079), new Employee("poonam", "HR", 10000),
                new Employee("panoti", "HR", 150000), new Employee("mansvi", "IT", 20000),
                new Employee("jatari", "Finance", 50000));

        Map<Boolean, List<Employee>> employeeWithSalary = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 50000));

        System.out.println("employee with salary > 50000");
        employeeWithSalary.get(true).forEach(System.out::println);

        System.out.println("employee with salary <= 5000");
        employeeWithSalary.get(false).forEach(System.out::println);

    }

}
