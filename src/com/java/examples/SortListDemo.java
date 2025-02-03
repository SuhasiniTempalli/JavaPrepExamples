package com.java.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SortListDemo {
    public static void main(String[] args) {
    List<Employee> employeeList=Database.getEmployees();
    Collections.sort(employeeList,((o1, o2) -> (int) (o1.getSalary()- o2.getSalary())));
    //employeeList.stream().sorted(((o1, o2) -> (int) (o1.getSalary()-o2.getSalary()))).forEach(System.out::println);
    employeeList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
        System.out.println(employeeList.stream().collect(groupingBy(Employee::getDept, mapping(Employee::getSalary, toList()))));
        System.out.println(employeeList.stream().collect(groupingBy(Employee::getDept,filtering(employee -> employee.getSalary()>600000,
                mapping(employee -> employee.getId(),Collectors.toList())))));
}
}