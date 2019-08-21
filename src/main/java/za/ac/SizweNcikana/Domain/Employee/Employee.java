package za.ac.SizweNcikana.Domain.Employee;

public class Employee {
    private String empId;
    private String firstName;
    private String lastName;

    //public
    private Employee(){

    }


    private Employee(Builder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.empId = builder.empId;
    }

    public static class Builder{
        private String empId;
        private String firstName;
        private String lastName;

        public Builder empId(String id)
        {
            this.empId = id;
            return this;
        }

        public Builder name(String name)
        {
            this.firstName = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.lastName = surname;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.empId = employee.empId;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;

            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    public String getEmpId()
    {
        return empId;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String toString()
    {
        String str;
        str = "EmployeeController ID: " + getEmpId() + " First Name: " + getfirstName() + " Last Name: " + getLastName();
        return str;
    }
}
