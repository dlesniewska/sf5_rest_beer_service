package dl.springframework.sf5_rest_beer_service.web.controller;

import dl.springframework.sf5_rest_beer_service.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer/")
@RestController
public class BeerController {

    //private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
