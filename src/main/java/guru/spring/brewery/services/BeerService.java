package guru.spring.brewery.services;

import guru.spring.brewery.models.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
