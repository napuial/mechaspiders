package mechaspiders.repository;

import mechaspiders.model.Mechaspider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MechaspiderRepository extends JpaRepository<Mechaspider, Long> {

}
