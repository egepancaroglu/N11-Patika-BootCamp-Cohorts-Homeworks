package com.egepancaroglu.hafta3.response;

import lombok.Data;

/**
 * @author egepancaroglu
 */

@Data
public class WeatherResponse {
    private String city;
    private String country;
    private String date;
    private double temperature;

}
