package fr.flippy.flip;

import fr.flippy.config.MapperConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class)
public interface FlipMapper {

    FlipEntity toEntity(Flip flip);

    Flip toToggle(FlipEntity entity);

    void update(@MappingTarget FlipEntity entity, Flip flip);
}
