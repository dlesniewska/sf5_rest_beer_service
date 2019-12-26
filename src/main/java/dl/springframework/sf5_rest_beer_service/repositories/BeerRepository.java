package dl.springframework.sf5_rest_beer_service.repositories;

import dl.springframework.sf5_rest_beer_service.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
