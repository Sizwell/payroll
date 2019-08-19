package za.ac.SizweNcikana.Services.Gender;

import za.ac.SizweNcikana.Domain.Gender.Gender;
import za.ac.SizweNcikana.Services.IService;

import java.util.Set;

public interface GenderService extends IService <Gender, String>
{
    Set<Gender> getAll();
}
