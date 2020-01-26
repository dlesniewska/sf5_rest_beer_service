package dl.springframework.sf5_rest_beer_service.services;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import dl.springframework.sf5_rest_beer_service.web.model.BeerPagedList;
import dl.springframework.sf5_rest_beer_service.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);
}
