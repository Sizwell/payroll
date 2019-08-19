package za.ac.SizweNcikana.Repository.Gender.Impl;

import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Repository.Gender.GenderRepository;

import java.util.*;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genders;

    private GenderRepositoryImpl()
    {
        this.genders = new HashMap<String, Gender>();
    }

    public static GenderRepository getRepository()
    {
        if(repository == null)
            repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Gender create(Gender gender) {
        if(read(gender.getGenderId()) == null)
        {
            this.genders.put(gender.getGenderId(), gender);
        }

        return this.genders.get(gender.getGenderId());

    }

    @Override
    public Gender read(String id) {
        return this.genders.get(id);
    }

    @Override
    public Gender update(Gender gender) {

        if(this.genders.get(gender.getGenderId()) != null)
        {
            delete(gender.getGenderId());
            create(gender);
        }
        //Complained about setting API to Lambdos 8 on genders.replace
        return this.genders.get(gender.getGenderId());

    }

    @Override
    public void delete(String id) {
        this.genders.remove(id);

    }

    @Override
    public Set<Gender> getAll() {
        Collection<Gender> mGender = this.genders.values();
        Set<Gender> set = new HashSet<>();
        set.addAll(mGender);
        return set;

    }
}