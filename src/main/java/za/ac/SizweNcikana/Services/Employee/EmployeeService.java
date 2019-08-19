package za.ac.SizweNcikana.Services.Employee;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Services.IService;

import java.util.Set;

public interface EmployeeService extends IService <Employee, String>
{
    Set<Employee> getEmployee();
}
