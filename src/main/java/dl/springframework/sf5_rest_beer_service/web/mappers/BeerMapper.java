package dl.springframework.sf5_rest_beer_service.web.mappers;

import dl.springframework.sf5_rest_beer_service.domain.Beer;
import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
