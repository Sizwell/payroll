package za.ac.SizweNcikana.Repository.Race;

import za.ac.SizweNcikana.Domain.Race.Race;
import za.ac.SizweNcikana.Repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository  <Race, String>
{
    Set<Race> getRace();
}
