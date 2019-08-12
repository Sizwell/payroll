package za.ac.SizweNcikana.Controller.EmployeeController;

import za.ac.SizweNcikana.Domain.Employee.Employee;
import za.ac.SizweNcikana.Factory.EmployeeFactory.EmployeeFactory;
import za.ac.SizweNcikana.Services.Employee.Impl.EmployeeServiceImpl;

import java.util.Set;

public class EmployeeController {
   // @Autowired
    private EmployeeServiceImpl service;

  //  @GetMapping("/create/{EmployeeName}")

   // public @ResponseBody
 /*   Employee create(@PathVariable String empName)
    {
        Employee employee = EmployeeFactory.getEmployee(empName);
        return service.create(employee);
    } */


  //  @GetMapping("/getAll")
  //  @ResponceBody

    public Set<Employee> getAll()
    {
        return service.getEmployee();
    }

}
