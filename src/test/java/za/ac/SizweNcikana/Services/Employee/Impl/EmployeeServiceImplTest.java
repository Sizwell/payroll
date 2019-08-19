package za.ac.SizweNcikana.Services.Employee.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Factory.EmployeeFactory.EmployeeFactory;
import za.ac.SizweNcikana.Repository.Employee.Impl.EmployeeRepositoryImpl;
import za.ac.SizweNcikana.Services.Employee.EmployeeService;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {


    private EmployeeService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Employee> employeeSet = service.getEmployee();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee( "Linomtha", "Ncikana");

        service.create(employee);

        Employee onCreate = service.read(employee.getEmpId());

        Assert.assertNotNull(onCreate);

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee( "Linomtha", "Ncikana");

        service.create(employee);

        Employee onRead = service.read(employee.getEmpId());

        Assert.assertNotNull(onRead);
    }

    @Test
    public void update() {

        String updateName = "Linomtha";
        String updateSurname = "Ncikana";

        Employee employee = EmployeeFactory.getEmployee( updateName, updateSurname);

        service.create(employee);
        Employee inRepo = service.read(employee.getEmpId());

        //employee.setEmpFirstName("Not Riaz");
        Employee updated = this.service.update(employee);
        System.out.println("Updated Employee...\n" + updated);

        Assert.assertEquals(updateName, updated.getfirstName());
        getAll();

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee("Linomtha", "Ncikana");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpId());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmpId());

        Employee deleted = service.read(employee.getEmpId());

        Assert.assertNull(deleted);

    }
}