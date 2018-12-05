package guru.springframework.sfgpetclinicv1.repositories;

import guru.springframework.sfgpetclinicv1.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
