package guru.springframework.breweryapp.services;

import guru.springframework.breweryapp.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
