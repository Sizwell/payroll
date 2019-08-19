package za.ac.SizweNcikana.Services.Employee.Impl;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Repository.Employee.EmployeeRepository;
import za.ac.SizweNcikana.Repository.Employee.Impl.EmployeeRepositoryImpl;
import za.ac.SizweNcikana.Services.Employee.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){

        if(service == null){
            service = new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getEmployee() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee type)
    {
        return repository.create(type);
    }

    @Override
    public Employee read(String s)
    {
        return repository.read(s);
    }

    @Override
    public Employee update(Employee type)
    {
        return repository.update(type);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }
}
