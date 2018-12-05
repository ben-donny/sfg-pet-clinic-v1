package guru.springframework.sfgpetclinicv1.repositories;

import guru.springframework.sfgpetclinicv1.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
