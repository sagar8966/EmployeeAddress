package Employee.Address.EmployeeAddress.Service;

import Employee.Address.EmployeeAddress.Model.Address;
import Employee.Address.EmployeeAddress.Model.Employee;
import Employee.Address.EmployeeAddress.Repositary.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressrepo;

    public Iterable<Address> getalladd() {
       return addressrepo.findAll();

    }

    public Optional<Address> getaddressbyid(Long id) {
        return addressrepo.findById(id);
    }

    public Iterable<Address> addAddress(List<Address> address) {
        return addressrepo.saveAll(address);
    }

    public String deleteaddbyid(Long id) {
        addressrepo.deleteById(id);
        return "AddressRemoved";
    }


    }

