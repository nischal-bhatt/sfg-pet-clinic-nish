package guru.springframework.sfgpetclinicnish.services;


import guru.springframework.sfgpetclinicnish.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
