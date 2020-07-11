package guru.springframework.breweryapp.services;

import guru.springframework.breweryapp.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Ramsville")
                .beerStyle("Weizen")
                .build();
    }
}
