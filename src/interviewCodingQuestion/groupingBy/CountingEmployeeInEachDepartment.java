package interviewCodingQuestion.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class CountingEmployeeInEachDepartment {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance"),
                new Employee("Frank", "Finance"),
                new Employee("Grace", "IT"));

//        Map<String, List<Employee>> stringListMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
        Map<String, List<String>> stringListMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(stringListMap);
        Map<String, Long> stringListMap1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(stringListMap1);


    }
}
