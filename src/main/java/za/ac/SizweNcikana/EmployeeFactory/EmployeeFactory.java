package za.ac.SizweNcikana.EmployeeFactory;

import za.ac.SizweNcikana.Domain.Employee.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String id, String name, String surname)
    {
        return new Employee.Builder()
                .empId(id)
                .name(name)
                .surname(surname)
                .build();
    }
}
