package de.github.ulrikewerner.webclientrickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;

    @GetMapping("/characters")
    List<RickAndMortyCharacter> getCharacterList() {
        return rickAndMortyService.getCharacterList();
    }
}
