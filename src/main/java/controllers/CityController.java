package controllers;


import forecast.City;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

//
@RestController
@RequestMapping("/get-coordinates")
public class CityController {

    public City getCoordinates(@RequestParam double longitude, double latitude){

        // create webclient to call to open meteo api

        WebClient client = WebClient.create("https://geocoding-api.open-meteo.com/v1");

        String uri = UriComponentsBuilder.fromUriString("/search") // comes after v1 in original api
                .queryParam("Bristol", longitude, latitude)
                .build()
                .toString();

        // call the API and get the long & lat from response
        City Bristol = client.get() // requests data from the uri
                .uri(uri)
                .retrieve()
                .bodyToMono(City.class)
                .block();

        return Bristol;
    }

}
