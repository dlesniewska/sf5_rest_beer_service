package dl.springframework.sf5_rest_beer_service.events;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}