package za.ac.SizweNcikana.Repository.Gender.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Factory.GenderFactory.GenderFactory;
import za.ac.SizweNcikana.Repository.Gender.GenderRepository;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private GenderRepository genderRepository;
    private Gender gender;

    private Gender getSavedGender()
    {
        Set<Gender> storedGender = this.genderRepository.getAll();
        return storedGender.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }

    @Test
    public void create()
    {
      /*  Gender create = this.genderRepository.create(this.gender);
        System.out.println("Creating...\n" + create);

        getAll();
        Assert.assertSame(create, this.gender); */

        Gender create = this.genderRepository.create(this.gender);
        System.out.println("On create: \n..." + create);
        getAll();
        Assert.assertEquals(create, this.gender);

    }

    @Test
    public void read()
    {
        Gender reading = GenderFactory.buildGender("Female");
       // Employee readingEmp = this.employee = EmployeeFactory.getEmployee("Monde", "Boyce");

        System.out.println("On read: \n..." + reading.getGenderId());
        genderRepository.create(gender);

        Gender reader = this.genderRepository.read(reading.getGenderId());

        System.out.println("Reading... " + reader);
        getAll();
        Assert.assertEquals(reading, reader);
    }

    @Test
    public void update()
    {

        String updateGender = "Female";

        Gender employeeGender = GenderFactory.buildGender(updateGender);
        //Employee employee = EmployeeFactory.getEmployee( updateGender, updateSurname);

        genderRepository.create(gender);
        //    employeeRepository.create(employee);

        //    Employee inRepo = employeeRepository.read(employee.getEmpId());

        //employee.setEmpFirstName("Not Riaz");
        Gender updated = this.genderRepository.update(gender);

        System.out.println("Updated Employee...\n" + updated);

        Assert.assertEquals(updated, updated.getEmpGender());
        getAll();
    }

    @Test
    public void delete()
    {
        Gender toDelete = getSavedGender();

        this.genderRepository.delete(toDelete.getGenderId());
        getAll();
    }

    @Test
    public void getAll()
    {
        Set<Gender> gettingAll = this.genderRepository.getAll();
        System.out.printf("Getting genders...\n" + gettingAll);
    }
}