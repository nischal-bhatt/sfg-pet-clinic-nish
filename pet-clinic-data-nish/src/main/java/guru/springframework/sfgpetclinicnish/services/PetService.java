package guru.springframework.sfgpetclinicnish.services;


import guru.springframework.sfgpetclinicnish.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
