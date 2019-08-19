package za.ac.SizweNcikana.Repository.Gender;

import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository <Gender, String>{
    Set<Gender> getAll();
}
