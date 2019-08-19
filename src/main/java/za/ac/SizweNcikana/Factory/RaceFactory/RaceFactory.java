package za.ac.SizweNcikana.Factory.RaceFactory;

import za.ac.SizweNcikana.Domain.Race.Race;

public class RaceFactory {

    public static Race buildEmpRace(String race)
    {
        return new Race.Builder()
                .empRace(race)
                .build();
    }
}
