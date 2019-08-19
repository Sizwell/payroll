package za.ac.SizweNcikana.Repository.Race.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Factory.RaceFactory.RaceFactory;
import za.ac.SizweNcikana.Repository.Race.RaceRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepository repository;
    private Race race;

    private Race getSavedRace()
    {
        Set<Race> storedGender = this.repository.getRace();
        return storedGender.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildEmpRace("African");
    }

    @Test
    public void getRace() {
    }

    @Test
    public void create()
    {
        Race create = this.repository.create(this.race);
        System.out.println("On create: \n..." + create);
        getAll();
        Assert.assertEquals(create, this.race);
    }

    @Test
    public void read()
    {
        Race reading = RaceFactory.buildEmpRace("Indian");
        System.out.println("On read: \n..." + reading.getRaceId());
        repository.create(race);

        Race reader = this.repository.read(reading.getRaceId());

        System.out.println("Reading... " + reader);
        getAll();
        Assert.assertEquals(reading, reader);
    }

    @Test
    public void update()
    {
        String updateRace = "Female";

        Race employeeRace = RaceFactory.buildEmpRace(updateRace);
        //Employee employee = EmployeeFactory.getEmployee( updateGender, updateSurname);

        repository.create(race);
        //    employeeRepository.create(employee);

        //    Employee inRepo = employeeRepository.read(employee.getEmpId());

        //employee.setEmpFirstName("Not Riaz");
        Race updated = this.repository.update(race);

        System.out.println("Updated Employee...\n" + updated);

        Assert.assertEquals(updated, updated.getEmpRace());
        getAll();
    }

    @Test
    public void delete()
    {
        Race toDelete = getSavedRace();

        this.repository.delete(toDelete.getRaceId());
        getAll();
    }

    @Test
    public void getAll()
    {
        Set<Race> gettingAll = this.repository.getRace();
        System.out.printf("Getting Race...\n" + gettingAll);
    }
}