package dl.springframework.sf5_rest_beer_service.events;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}