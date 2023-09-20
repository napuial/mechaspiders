package mechaspiders.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mechaspiders")
public class Mechaspider {

    @Id
    @GeneratedValue
    private Long id;
    private String model;
}
