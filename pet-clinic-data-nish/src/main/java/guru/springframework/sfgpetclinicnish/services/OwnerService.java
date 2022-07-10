package guru.springframework.sfgpetclinicnish.services;

import guru.springframework.sfgpetclinicnish.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner ownser);

    Set<Owner> findAll();
}
