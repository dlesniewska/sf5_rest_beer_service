package dl.springframework.sf5_rest_beer_service.events;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
