package dl.springframework.sf5_rest_beer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class Sf5RestBeerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sf5RestBeerServiceApplication.class, args);
    }

}
