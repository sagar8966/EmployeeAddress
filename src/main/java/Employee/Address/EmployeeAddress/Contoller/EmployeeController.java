package Employee.Address.EmployeeAddress.Contoller;

import Employee.Address.EmployeeAddress.Model.Employee;
import Employee.Address.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService serviceemp;

    @GetMapping("Employee")
    public Iterable<Employee> allemployee(){
        return serviceemp.allemployee();
    }
    @GetMapping("Employee/id")
    public Optional<Employee> getempbyid(@PathVariable Long id){
        return serviceemp.getempbyid(id);
    }
    @PostMapping("Employee")
    public Iterable<Employee> addemployee(@RequestBody List<Employee> employee){
        return serviceemp.addemployee(employee);
    }
    @PutMapping("Employee/{id}")
    public String updateempbyid(@PathVariable Long id,@RequestBody Employee employee){
         serviceemp.updateempbyid(id, employee);
         return "updated";
    }
    @DeleteMapping("removeemployee")
    public String removeemployee(@PathVariable Long id){
        return serviceemp.removeemployee(id);
    }


}
