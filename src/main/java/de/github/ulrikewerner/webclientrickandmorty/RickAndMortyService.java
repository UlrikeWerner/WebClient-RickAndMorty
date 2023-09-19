package de.github.ulrikewerner.webclientrickandmorty;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class RickAndMortyService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public RickAndMortyCharacterResponse getCharacterList() {

        return Objects.requireNonNull(webClient
                                .get()
                                .uri("/character")
                                .retrieve()
                                .toEntity(RickAndMortyCharacterResponse.class)
                                .block())
                                .getBody();
    }
}
