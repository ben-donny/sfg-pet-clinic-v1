package guru.springframework.sfgpetclinicv1.repositories;

import guru.springframework.sfgpetclinicv1.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
