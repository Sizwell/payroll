package za.ac.SizweNcikana.Services.Gender.Impl;

import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Repository.Gender.GenderRepository;
import za.ac.SizweNcikana.Repository.Gender.Impl.GenderRepositoryImpl;
import za.ac.SizweNcikana.Services.Gender.GenderService;
import za.ac.SizweNcikana.Services.Race.Impl.RaceServiceImpl;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl()
    {
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService()
    {
        if(service == null)
            service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender type)
    {
        return repository.create(type);
    }

    @Override
    public Gender read(String s)
    {
        return repository.read(s);
    }

    @Override
    public Gender update(Gender type)
    {
        return repository.update(type);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }
}
