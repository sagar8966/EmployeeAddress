package Employee.Address.EmployeeAddress.Repositary;

import Employee.Address.EmployeeAddress.Model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
//    @Modifying
//    @Query(value ="UPDATE EMPLOYEE NAME BY ID ")
//    void Updateempbyid(Long id);

    Employee findByEmployeeid(Long id);
}

