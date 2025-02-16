package com.java.examples;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", 600000));
        list.add(new Employee(388, "Bikash", 900000));
        list.add(new Employee(470, "Bimal",  500000));
        list.add(new Employee(624, "Sourav", 400000));
        list.add(new Employee(176, "Prakash", 1200000));
        return list;
    }
}
