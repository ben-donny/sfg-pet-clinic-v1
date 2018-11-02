package guru.springframework.sfgpetclinicv1.services;

import guru.springframework.sfgpetclinicv1.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();


}
