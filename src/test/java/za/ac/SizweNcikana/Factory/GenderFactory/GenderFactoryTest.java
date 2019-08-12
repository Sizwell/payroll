package za.ac.SizweNcikana.Factory.GenderFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Gender.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        gender = GenderFactory.buildGender("Female");
    }

    @Test
    public void buildGender()
    {
        Assert.assertEquals(gender.getEmpGender(), "Female", "Female");
        System.out.println("Employee Gender is " +  gender.getEmpGender());
    }

  /*  @Test
    public void tryMe()
    {
        Assert.assertEquals(gender.getEmpGender(), gender.getEmpGender());

    } */
}