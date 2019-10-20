package dl.springframework.sf5_rest_beer_service.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private Integer version;
    private String beerName;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private BeerStyle beerStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
