package Employee.Address.EmployeeAddress.Service;

import Employee.Address.EmployeeAddress.Model.Employee;
import Employee.Address.EmployeeAddress.Repositary.IEmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Iterable<Employee> allemployee() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getempbyid(Long id ) {
        return employeeRepo.findById(id);
    }

    public Iterable<Employee> addemployee(List <Employee> employee) {
        return employeeRepo.saveAll(employee);
    }

    public String removeemployee(Long id) {
        employeeRepo.deleteById(id);
        return "Employee removed";
    }

    public void updateempbyid(Long id, Employee employee) {
        Employee employee1=employeeRepo.findByEmployeeid(id);
        if(employee1!=null){
            employee1.setFirstname(employee.getFirstname());
            employeeRepo.save(employee1);
        }

    }
}
