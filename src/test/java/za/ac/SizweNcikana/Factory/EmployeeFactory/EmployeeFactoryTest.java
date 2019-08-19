package za.ac.SizweNcikana.Factory.EmployeeFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Employee.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee employee;


    @Before
    public void setUp() throws Exception
    {
        this.employee = EmployeeFactory.getEmployee("Odwa", "Ncikana");
    }
/*
    @Test
    public void getEmployeeName()
    {
        Assert.assertEquals(employee.getLastName(), "Ncikana", "Ncikana");
    }
*/

    @Test
    public void getEmployee()
    {
        Assert.assertEquals(employee.getfirstName(), "Odwa", "Odwa");

    }
}