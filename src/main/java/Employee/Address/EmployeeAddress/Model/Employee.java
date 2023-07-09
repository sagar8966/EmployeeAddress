package Employee.Address.EmployeeAddress.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeid;
    private String firstname;
    private String lastname;

    @OneToOne
    @JoinColumn(name = "FK_addressid")
     Address address;

}
