package za.ac.SizweNcikana.Domain.Gender;

public class Gender {
    private String genderId;
    private String empGender;

    public Gender()
    {

    }

    public Gender(Builder builder)
    {
        this.genderId = builder.genderId;
        this.empGender = builder.empGender;
    }

    public static class Builder
    {
        private String genderId;
        private String empGender;

        public Builder genderID(String gId)
        {
            this.genderId = gId;
            return this;
        }
        public Builder empID(String id)
        {
            this.genderId = id;
            return this;
        }

        public Builder emplGender(String gend)
        {
            this.empGender = gend;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }
    }

    public String getGenderId()
    {
        return genderId;
    }

    public String getEmpGender()
    {
        return empGender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", empGender='" + empGender + '\'' +
                '}';
    }
}
