package com.pracs;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStreamApi {
    public static void main(String[] args) {
       List<Employee> listOfEmployee = new ArrayList<>();
       listOfEmployee.add(new Employee("Essakimuthu",24,"Vasai"));
       listOfEmployee.add(new Employee("Rahul",23,"Andheri"));
       listOfEmployee.add(new Employee("Roshan",18,"Ghatkopar"));
       listOfEmployee.add(new Employee("Gautham",20,"Vasai"));


       //to collect the targeted name from list of employee;

        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.next();

        List<Employee> matchedEmpListWithName = listOfEmployee.stream().filter(employee -> employee.getName().equalsIgnoreCase(employeeName)).collect(Collectors.toList());
        System.out.println(matchedEmpListWithName);

        //filter out the age greater than 23

        List<Employee> empWithAgeGreaterThan23 = listOfEmployee.stream().filter(employee -> employee.getAge() > 23).collect(Collectors.toList());
        System.out.println(empWithAgeGreaterThan23);

        //make the employee name in Upper Case

        List<String> employeeNameInUpperCase = listOfEmployee.stream().map(employee -> employee.getName().toUpperCase(Locale.ENGLISH)).collect(Collectors.toList());
        System.out.println(employeeNameInUpperCase);

        //to get the count of employee with same city

        Map<String, Long> listOfEmployeeWithSameCity = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
        System.out.println(listOfEmployeeWithSameCity);

        //get the list of employee with same city;

      List<Employee> listOfEmpWithVasai = listOfEmployee.stream().filter(employee -> employee.getCity().equalsIgnoreCase("vasai")).collect(Collectors.toList());
        System.out.println(listOfEmpWithVasai);

        //count of emp

        long count = listOfEmployee.stream().count();
        System.out.println("Total Count of Emp is : "+count);

        List<Employee> evenAgeEmp = listOfEmployee.stream().filter(employee -> employee.getAge() % 2 == 0).collect(Collectors.toList());
        System.out.println(evenAgeEmp);

    }
}
