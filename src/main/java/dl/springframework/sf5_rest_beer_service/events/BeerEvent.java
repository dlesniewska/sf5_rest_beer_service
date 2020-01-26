package dl.springframework.sf5_rest_beer_service.events;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -5781515597148163111L;

    private final BeerDto beerDto;
}
