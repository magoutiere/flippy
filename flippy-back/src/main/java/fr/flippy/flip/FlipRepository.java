package fr.flippy.flip;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface FlipRepository extends CrudRepository<FlipEntity, String> {

    FlipEntity findByName(String name);
}
