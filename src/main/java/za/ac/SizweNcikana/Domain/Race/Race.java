package za.ac.SizweNcikana.Domain.Race;

public class Race {

    private String raceId;
    private String empRace;

    public Race()
    {

    }

    public Race(Builder builder)
    {
        this.raceId = builder.raceId;
        this.empRace = builder.empRace;
    }

    public static class Builder
    {
        private String raceId;
        private String empRace;

        public Builder raceID(String id)
        {
            this.raceId = id;;
            return this;
        }

        public Builder empRace(String mRace)
        {
            this.empRace = mRace;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }
    }

    public String getRaceId()
    {
        return raceId;
    }

    public String getEmpRace()
    {
        return empRace;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", empRace='" + empRace + '\'' +
                '}';
    }
}
