package fr.flippy.flip;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class FlipService {

    private final FlipRepository flipRepository;

    private final FlipMapper flipMapper;

    public List<Flip> getToggles() {
        var toggles = flipRepository.findAll();

        return StreamSupport.stream(toggles.spliterator(), false)//
                .map(flipMapper::toToggle)//
                .toList();
    }

    public void updateFlip(final Flip flip) {
        var flipEntity = Optional.ofNullable(flipRepository.findByName(flip.getName()))
                .orElseGet(FlipEntity::new);
        flipMapper.update(flipEntity, flip);
        flipRepository.save(flipEntity);
    }
}
