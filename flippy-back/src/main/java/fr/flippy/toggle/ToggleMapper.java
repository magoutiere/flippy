package fr.flippy.toggle;

import fr.flippy.config.MapperConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class)
public interface ToggleMapper {

    ToggleEntity toEntity(Toggle toggle);

    Toggle toToggle(ToggleEntity entity);

    void updateToggleEntity(@MappingTarget ToggleEntity entity, Toggle toggle);
}
