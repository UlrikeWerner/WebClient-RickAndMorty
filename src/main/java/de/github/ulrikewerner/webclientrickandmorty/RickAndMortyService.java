package de.github.ulrikewerner.webclientrickandmorty;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class RickAndMortyService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public List<RickAndMortyCharacter> getCharacterList() {

        return Objects.requireNonNull(
                Objects.requireNonNull(webClient
                                .get()
                                .uri("/character")
                                .retrieve()
                                .toEntityList(RickAndMortyCharacter.class)
                                .block())
                        .getBody());
    }
}
