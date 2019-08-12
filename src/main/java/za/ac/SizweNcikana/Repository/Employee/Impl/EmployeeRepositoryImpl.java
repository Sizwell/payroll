package za.ac.SizweNcikana.Repository.Employee.Impl;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Repository.Employee.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl()
    {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepository getRepository()
    {
        if(repository == null)
            repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll()
    {
        Collection<Employee> employ = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employ);
        return set;
    }

    @Override
    public Employee create(Employee employee)
    {
        if(read(employee.getEmpId()) == null)
        {
            this.employees.put(employee.getEmpId(), employee);
        }
        return this.employees.get(employee.getEmpId());

    }

    @Override
    public Employee read(String id)
    {
        return this.employees.get(id);
    }

    @Override
    public Employee update(Employee employee)
    {
        if(this.employees.get(employee.getEmpId()) != null)
        {
            delete(employee.getEmpId());
            create(employee);
        }
        return this.employees.get(employee.getEmpId());
        //this.employees.replace(employee.getEmpId(), employee);
       // return this.employees.get(employee.getEmpId());
    }

    @Override
    public void delete(String id)
    {
        this.employees.remove(id);

    }
}
