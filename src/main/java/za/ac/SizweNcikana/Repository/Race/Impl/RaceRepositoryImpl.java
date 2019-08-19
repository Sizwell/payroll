package za.ac.SizweNcikana.Repository.Race.Impl;

import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Repository.Race.RaceRepository;

import java.util.*;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;
    private List<Race> raceList;

    private RaceRepositoryImpl()
    {
        this.raceList = new ArrayList<>();
    }

    public static RaceRepository getRepository()
    {
        if(repository == null)

            repository = new RaceRepositoryImpl();
            return repository;

    }

    @Override
    public Set<Race> getRace()
    {
        Collection<Race> raceCollection = this.raceList;
        Set<Race> raceSet = new HashSet<>();
        raceSet.addAll(raceCollection);
        return raceSet;
    }

    @Override
    public Race create(Race race)
    {
        if(read(race.getRaceId()) == null)
        {
            this.raceList.add(race);
        }
        return read(race.getRaceId());

    }

    @Override
    public Race read(String id)
    {
        return this.raceList.stream().filter(race -> race.equals(race.getRaceId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Race update(Race race)
    {
        Race toUpdate = read(race.getRaceId());

        if(toUpdate != null)
        {
            raceList.remove(toUpdate);
            create(race);
        }
        return null;
        //this.raceMap.replace(race.getRaceId(), race);
       // return this.raceMap.get(race.getRaceId());
    }

    @Override
    public void delete(String id)
    {
        Race toDelete = read(id);

        if(toDelete != null)
        {
            this.raceList.remove(id);
        }

    }
}
