package guru.springframework.sfgpetclinic.data.services;

import guru.springframework.sfgpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(Long id);

}
