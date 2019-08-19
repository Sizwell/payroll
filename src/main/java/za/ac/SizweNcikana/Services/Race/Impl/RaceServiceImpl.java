package za.ac.SizweNcikana.Services.Race.Impl;

import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Repository.Race.Impl.RaceRepositoryImpl;
import za.ac.SizweNcikana.Repository.Race.RaceRepository;
import za.ac.SizweNcikana.Services.Race.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl service = null;
    private RaceRepository raceRepository;

    private RaceServiceImpl()
    {
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    public static RaceServiceImpl getService()
    {
        if (service == null)
            service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Set<Race> getAll()
    {
        return raceRepository.getRace();
    }

    @Override
    public Race create(Race type)
    {
        return raceRepository.create(type);
    }

    @Override
    public Race read(String s)
    {
        return raceRepository.read(s);
    }

    @Override
    public Race update(Race type)
    {
        return raceRepository.update(type);
    }

    @Override
    public void delete(String s)
    {
        raceRepository.delete(s);
    }
}
