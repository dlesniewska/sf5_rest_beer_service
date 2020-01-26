package dl.springframework.sf5_rest_beer_service.services.brewing;

import dl.springframework.sf5_rest_beer_service.config.JmsConfig;
import dl.springframework.sf5_rest_beer_service.domain.Beer;
import dl.springframework.sf5_rest_beer_service.events.BrewBeerEvent;
import dl.springframework.sf5_rest_beer_service.repositories.BeerRepository;
import dl.springframework.sf5_rest_beer_service.services.inventory.BeerInventoryService;
import dl.springframework.sf5_rest_beer_service.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class BrewingService {

    private final BeerRepository beerRepository;
    private final BeerInventoryService beerInventoryService;
    private final JmsTemplate jmsTemplate;
    private final BeerMapper beerMapper;

    @Scheduled(fixedRate = 5000) //every 5 seconds
    public void checkForLowInventory(){
        List<Beer> beers = beerRepository.findAll();

        beers.forEach(beer -> {
            Integer invQOH = beerInventoryService.getOnhandInventory(beer.getId());

            log.debug("Min Onhand is: " + beer.getMinOnHand());
            log.debug("Inventory is: "  + invQOH);

            if(beer.getMinOnHand() >= invQOH){
                jmsTemplate.convertAndSend(JmsConfig.BREWING_REQUEST_QUEUE, new BrewBeerEvent(beerMapper.beerToBeerDto(beer)));
            }
        });

    }

}
