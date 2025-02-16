package com.java.stream;

import com.java.examples.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSortOnSalary {
    public static void main(String[] args) {
        // Sample Employee Data
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Jeff", 100000),
                new Employee(2, "Bill", 200000),
                new Employee(3, "Mark", 400000),
                new Employee(4, "Elon", 300000)
        );

        // Given Filter Criteria
        List<Integer> filterEmpIds = Arrays.asList(1, 2, 3, 4, 5); // IDs to filter
        long salaryThreshold = 200000; // Salary condition

        // Filtering employees based on given ID list and salary >= 200000
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> filterEmpIds.contains(emp.getId()) && emp.getSalary() >= salaryThreshold)
                .collect(Collectors.toList());

        // Displaying the filtered employees
        filteredEmployees.forEach(System.out::println);
    }
    }

