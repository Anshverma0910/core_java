package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ansh", 22, 80000, "IT"));
        list.add(new Employee("Shivam", 26, 30000, "HR"));
        list.add(new Employee("Anshu", 17, 90000, "Manager"));
        list.add(new Employee("Kavita", 32, 60000, "HR"));
        list.add(new Employee("Swati", 38, 30000, "Marketing"));
        list.add(new Employee("Kuldeep", 43, 80000, "IT"));
    }
}