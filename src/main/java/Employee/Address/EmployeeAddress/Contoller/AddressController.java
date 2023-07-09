package Employee.Address.EmployeeAddress.Contoller;

import Employee.Address.EmployeeAddress.Model.Address;
import Employee.Address.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService serviceadd;

    @GetMapping("Address")
    public Iterable<Address> getalladd(){
       return serviceadd.getalladd();
    }
    @GetMapping("Address/id/{id}")
    public Optional<Address> getaddressbyid(@PathVariable Long id){
        return serviceadd.getaddressbyid(id);
    }
    @PostMapping("Address")
    public Iterable<Address> addAddress(@RequestBody List <Address> address){
        return serviceadd.addAddress(address);
    }

    @DeleteMapping("Address/{id}")
    public String deleteaddbyid(@PathVariable Long id){
        return serviceadd.deleteaddbyid(id);
    }
}
