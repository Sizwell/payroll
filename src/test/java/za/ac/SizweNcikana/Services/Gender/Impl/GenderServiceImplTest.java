package za.ac.SizweNcikana.Services.Gender.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Controller.EmployeeController.EmployeeController;
import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Factory.EmployeeFactory.EmployeeFactory;
import za.ac.SizweNcikana.Factory.GenderFactory.GenderFactory;
import za.ac.SizweNcikana.Factory.RaceFactory.RaceFactory;
import za.ac.SizweNcikana.Services.Gender.GenderService;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Gender> genders = service.getAll();
        Assert.assertNotNull(genders);

    }
    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender("Female");

        service.create(gender);

        Gender onCreate = service.read(gender.getGenderId());

        Assert.assertNotNull(onCreate);

        Race race = RaceFactory.buildEmpRace("African");
        Employee employee = EmployeeFactory.getEmployee("Sizwe", "Ncikana");



    }
    @Test
    public void read() {

        Gender gender = GenderFactory.buildGender("Female");

        service.create(gender);

        Gender onRead = service.read(gender.getGenderId());

        Assert.assertNotNull(onRead);
    }

    @Test
    public void update() {

        Gender gender = GenderFactory.buildGender("Female");

        service.create(gender);

        Gender onUpdate = service.read(gender.getGenderId());


        service.update(gender);
        Assert.assertEquals(gender.getGenderId(), onUpdate.getGenderId());

    }

    @Test
    public void delete() {

        Gender gender = GenderFactory.buildGender("Female");

        service.create(gender);

        Gender inRepo = service.read(gender.getGenderId());

        Assert.assertNotNull(inRepo);

        service.delete(gender.getGenderId());

        Gender deleted = service.read(gender.getGenderId());

        Assert.assertNull(deleted);

    }
}