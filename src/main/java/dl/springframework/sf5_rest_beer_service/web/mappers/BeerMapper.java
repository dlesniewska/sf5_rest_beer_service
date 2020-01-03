package dl.springframework.sf5_rest_beer_service.web.mappers;

import dl.springframework.sf5_rest_beer_service.domain.Beer;
import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

    BeerDto beerToBeerDtoWithInventory(Beer beer);
}
