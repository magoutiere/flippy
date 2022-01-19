package fr.flippy.flip;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/flip")
@RestController
@RequiredArgsConstructor
public class FlipController {

    private final FlipService flipService;

    @GetMapping
    public List<Flip> getFlips() {
        return flipService.getToggles();
    }

    @PostMapping
    public void updateFlip(@RequestBody Flip flip) {
        log.info("Update {} : {}", flip.getName(), flip.isState());
        flipService.updateFlip(flip);
    }
}
