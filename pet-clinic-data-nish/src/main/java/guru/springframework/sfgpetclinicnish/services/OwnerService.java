package guru.springframework.sfgpetclinicnish.services;

import guru.springframework.sfgpetclinicnish.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
