package de.github.ulrikewerner.webclientrickandmorty;

import java.util.List;

public record RickAndMortyCharacterResponse(
        List<RickAndMortyCharacter> results
) {
}
