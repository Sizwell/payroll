package za.ac.SizweNcikana.Factory.EmployeeFactory;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Util.Misc;

public class EmployeeFactory {
    public static Employee getEmployee(String name, String surname)
    {
        return new Employee.Builder()
                .empId(Misc.generateId())
                .name(name)
                .surname(surname)
                .build();
    }
}
