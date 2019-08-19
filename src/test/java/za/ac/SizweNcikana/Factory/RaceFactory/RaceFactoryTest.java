package za.ac.SizweNcikana.Factory.RaceFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.SizweNcikana.Domain.Race.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;

    @Before
    public void setUpRace() throws Exception
    {
        race = RaceFactory.buildEmpRace("African");
    }

    @Test
    public void buildEmpRace()
    {
        Assert.assertEquals(race.getEmpRace(), "White", "White");
        System.out.println("Employee Race is " + race.getEmpRace());
    }
}