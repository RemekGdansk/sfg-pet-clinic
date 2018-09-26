package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(Long id);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
