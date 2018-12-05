package guru.springframework.sfgpetclinicv1.repositories;

import guru.springframework.sfgpetclinicv1.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
