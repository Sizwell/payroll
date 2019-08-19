package za.ac.SizweNcikana.Services.Race.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Factory.RaceFactory.RaceFactory;
import za.ac.SizweNcikana.Services.Race.RaceService;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();

    }

    @Test
    public void getAll() {

        Set<Race> races = service.getAll();
        Assert.assertNotNull(races);

    }
    @Test
    public void create() {

        Race race = RaceFactory.buildEmpRace("Coloured");

        service.create(race);

        Race onCreate = service.read(race.getRaceId());

        Assert.assertNotNull(onCreate);

    }
    @Test
    public void read() {

        Race race = RaceFactory.buildEmpRace("Coloured");

        service.create(race);

        Race onRead = service.read(race.getRaceId());

        Assert.assertNotNull(onRead);
    }

    @Test
    public void update() {

        Race race = RaceFactory.buildEmpRace("Coloured");

        service.create(race);

        Race onUpdate = service.read(race.getRaceId());
        service.update(race);
        Assert.assertEquals(race.getRaceId(), onUpdate.getRaceId());

    }

    @Test
    public void delete() {

        Race race = RaceFactory.buildEmpRace("Coloured");

        service.create(race);

        Race inRepo = service.read(race.getRaceId());

        Assert.assertNotNull(inRepo);

        service.delete(race.getRaceId());

        Race deleted = service.read(race.getRaceId());

        Assert.assertNull(deleted);

    }

}