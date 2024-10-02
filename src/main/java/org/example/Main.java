package org.example;
import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "michael","scott"));
        employees.add(new Employee(2, "dwight","schrute"));
        employees.add(new Employee(3, "jim","halpert"));
        employees.add(new Employee(4, "pam","beesly"));
        employees.add(new Employee(5, "creed","bratton"));
        employees.add(new Employee(6, "kevin","malone"));
        employees.add(new Employee(7, "angela","martin"));
        employees.add(new Employee(8, "toby","flenderson"));
        employees.add(new Employee(9, "kelly","kapoor"));
        employees.add(new Employee(10, "stanley","hudson"));
        employees.add(new Employee(11, "ryan","howard"));
        employees.add(new Employee(12, "oscar","martinez"));
        employees.add(new Employee(5, "creed","bratton"));

    }

    public static List<Employee> findDuplicates(List<Employee> list){
    List<Employee> duplicateEmployees = new LinkedList<>();
    List<Employee> uniqueEmployees = new LinkedList<>();
    for(Employee employee : list){
        if(uniqueEmployees.contains(employee)){
            if(!duplicateEmployees.contains(employee)) {
                duplicateEmployees.add(employee);
            }
        }
        else {
            uniqueEmployees.add(employee);
        }
    }
    return duplicateEmployees;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list){

        Set<Employee> setOfEmployees = new HashSet<>(list);
        Map<Integer, Employee> mapOfEmployees = new HashMap<>();
        for(Employee employee: setOfEmployees){
            if(employee == null) continue;
            mapOfEmployees.put(employee.getId(), employee);
        }
        return mapOfEmployees;
    }

    public static List<Employee> removeDuplicates(List<Employee> list){
        List<Employee> duplicated = findDuplicates(list);
       duplicated.add(null);
        list.removeAll(duplicated);
        return list;
    }
}