package za.ac.SizweNcikana.Factory.GenderFactory;

import za.ac.SizweNcikana.Domain.Gender.Gender;

public class GenderFactory {

    public static Gender buildGender(String mGender)
    {
        return new Gender.Builder()
                .emplGender(mGender)
                .build();
    }
}
