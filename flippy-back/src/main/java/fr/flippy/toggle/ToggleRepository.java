package fr.flippy.toggle;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ToggleRepository extends CrudRepository<ToggleEntity, String> {

    Optional<ToggleEntity> findByName(String name);
}
