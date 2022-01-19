package fr.flippy.toggle;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/toggle")
@RestController
@RequiredArgsConstructor
public class ToggleController {

    private final ToggleService toggleService;

    @GetMapping
    public List<Toggle> getToggles() {
        return toggleService.getToggles();
    }

    @PostMapping
    public void updateToggle(@RequestBody Toggle toggle) {
        toggleService.updateToggle(toggle);
    }
}
