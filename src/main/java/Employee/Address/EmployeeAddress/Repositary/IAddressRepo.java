package Employee.Address.EmployeeAddress.Repositary;

import Employee.Address.EmployeeAddress.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {

}
