package com.egepancaroglu.hafta3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author egepancaroglu
 */

@Configuration
public class WeatherApiConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
