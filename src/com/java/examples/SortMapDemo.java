    package com.java.examples;

    import java.util.*;

    public class SortMapDemo {
        public static void main(String[] args) {



            Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
            employeeMap.put(new Employee(176, "Roshan",  600000), 60);
            employeeMap.put(new Employee(388, "Bikash",  900000), 90);
            employeeMap.put(new Employee(470, "Bimal",  500000), 50);
            employeeMap.put(new Employee(624, "Sourav", 400000), 40);
            employeeMap.put(new Employee(284, "Prakash",  1200000), 120);

            System.out.println(employeeMap);

            Map<Employee, Integer> filteredSortedEmployees = employeeMap.entrySet().stream()
                    .filter(entry -> entry.getKey().getSalary() > 2000) // Filter employees with salary > 2000
                    .sorted(Map.Entry.comparingByKey(Comparator.comparingDouble(Employee::getSalary))) // Sort by salary
                    .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
            filteredSortedEmployees.forEach((employee, rating) -> System.out.println(employee + " - Rating: " + rating));

/*
            employeeMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                    .forEach(System.out::println);*/
    }
    }

