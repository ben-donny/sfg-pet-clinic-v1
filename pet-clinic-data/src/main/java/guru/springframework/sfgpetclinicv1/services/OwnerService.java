package guru.springframework.sfgpetclinicv1.services;

import guru.springframework.sfgpetclinicv1.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
