package za.ac.SizweNcikana.Repository.Employee.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Factory.EmployeeFactory.EmployeeFactory;
import za.ac.SizweNcikana.Repository.Employee.EmployeeRepository;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;


    //GetSaved() is  used in the Delete() test
    private Employee getSavedEmployee()
    {
        Set<Employee> storedEmployee = this.employeeRepository.getAll();
        return storedEmployee.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Monde", "Boyce");
    }

    @Test
    public void create()
    {
        Employee createEmp = this.employeeRepository.create(this.employee);
        System.out.println("On create: \n..." + createEmp);
        getAll();
        Assert.assertEquals(createEmp, this.employee);
    }

    @Test
    public void read()
    {
      /*  Employee readingEmp = getSavedEmployee();
        System.out.println("On read: \n..." + readingEmp.getEmpId());

        Employee reader = this.employeeRepository.read(readingEmp.getEmpId());
        System.out.println("Reading... " + reader);

        getAll();
        Assert.assertEquals(readingEmp, reader); */

       // Employee readingEmp = this.employee = EmployeeFactory.getEmployee("Monde", "Boyce");
        Employee readingEmp = EmployeeFactory.getEmployee("Monde", "Boyce");

        System.out.println("On read: \n..." + readingEmp.getEmpId());
        employeeRepository.create(employee);

        Employee reader = this.employeeRepository.read(readingEmp.getEmpId());
        System.out.println("Reading... " + reader);
        getAll();
        Assert.assertNotEquals(readingEmp, reader);

    }

    @Test
    public void update()
    {
      /*  String updateName = "Mondey";

        Employee employee = new Employee.Builder().copy(getSavedEmployee()).name(updateName).build();
        System.out.println("On Update... \n" + employee);

        Employee updated = this.employeeRepository.update(employee);
        System.out.println("Updated Employee..." + updated);

        Assert.assertNotSame(updateName, updated.getfirstName());
        getAll(); */

        String updateName = "Mondes";
        String updateSurname = "Boyce";

        Employee employee = EmployeeFactory.getEmployee( updateName, updateSurname);

        employeeRepository.create(employee);
        Employee inRepo = employeeRepository.read(employee.getEmpId());

        //employee.setEmpFirstName("Not Riaz");
        Employee updated = this.employeeRepository.update(employee);
        System.out.println("Updated Employee...\n" + updated);

        Assert.assertEquals(updateName, updated.getfirstName());
        getAll();

    }

    @Test
    public void delete()
    {
        Employee toDelete = getSavedEmployee();

        this.employeeRepository.delete(toDelete.getEmpId());
        getAll();
    }

    @Test
    public void getAll()
    {
        Set<Employee> all = this.employeeRepository.getAll();
        System.out.println("Getting all... /n" + all);
    }
}