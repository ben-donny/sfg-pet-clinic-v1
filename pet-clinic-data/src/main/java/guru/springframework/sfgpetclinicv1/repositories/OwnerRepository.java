package guru.springframework.sfgpetclinicv1.repositories;

import guru.springframework.sfgpetclinicv1.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
