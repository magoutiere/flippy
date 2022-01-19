package fr.flippy.toggle;

import java.util.List;
import java.util.stream.StreamSupport;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ToggleService {

    private final ToggleRepository toggleRepository;

    private final ToggleMapper toggleMapper;

    public List<Toggle> getToggles() {
        var toggles = toggleRepository.findAll();

        return StreamSupport.stream(toggles.spliterator(), false)//
            .map(toggleMapper::toToggle)//
            .toList();
    }

    public void updateToggle(final Toggle toggle) {
        var toggleEntity = toggleRepository.findByName(toggle.getName())//
            .orElseGet(() -> toggleMapper.toEntity(toggle));
        toggleMapper.updateToggleEntity(toggleEntity, toggle);
        toggleRepository.save(toggleEntity);
    }
}
