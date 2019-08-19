package za.ac.SizweNcikana.Services.Race;

import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Services.IService;

import java.util.Set;

public interface RaceService extends IService <Race, String>
{
    Set<Race> getAll();
}
