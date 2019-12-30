package dl.springframework.sf5_rest_beer_service.web.services;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
