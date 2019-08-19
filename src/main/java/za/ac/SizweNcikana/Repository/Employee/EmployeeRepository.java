package za.ac.SizweNcikana.Repository.Employee;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Repository.IRepository;

import java.util.Map;
import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {

    Set<Employee> getAll();
    }
