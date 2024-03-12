package com.egepancaroglu.hafta3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author egepancaroglu
 */

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city},{country}&appid={apiKey}";
    private final String apiWeeklyUrl = "https://api.openweathermap.org/data/2.5/forecast?q={city},{country}&appid={apiKey}";
    private final String apiMonthlyUrl = "https://api.openweathermap.org/data/2.5/forecast/daily?q={city},{country}&cnt=30&appid={apiKey}";
    private final RestTemplate restTemplate;

    @Value("${openweathermap.apiKey}")
    private String apiKey;


    @GetMapping("/current/{country}/{city}")
    public ResponseEntity<String> getCurrentWeather(@PathVariable String country, @PathVariable String city) {
        try {
            String url = apiUrl.replace("{country}", country).replace("{city}", city).replace("{apiKey}", apiKey);
            return restTemplate.getForEntity(url, String.class);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while fetching current weather.");
        }
    }

    @GetMapping("/weekly/{country}/{city}")
    public ResponseEntity<String> getWeeklyWeather(@PathVariable String country, @PathVariable String city) {
        try {
            String url = apiWeeklyUrl.replace("{country}", country).replace("{city}", city).replace("{apiKey}", apiKey);
            return restTemplate.getForEntity(url, String.class);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while fetching weekly weather.");
        }
    }

    @GetMapping("/monthly/{country}/{city}")
    public ResponseEntity<String> getMonthlyWeather(@PathVariable String country, @PathVariable String city) {
        try {
            String url = apiMonthlyUrl.replace("{country}", country).replace("{city}", city).replace("{apiKey}", apiKey);
            return restTemplate.getForEntity(url, String.class);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while fetching monthly weather.");
        }
    }
}