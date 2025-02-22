package com.example.weather_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Main main;
    private Weather[] weather;

    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }

    public Weather[] getWeather() { return weather; }
    public void setWeather(Weather[] weather) { this.weather = weather; }

    static class Main {
        private double temp;
        private int humidity;

        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }

        public int getHumidity() { return humidity; }
        public void setHumidity(int humidity) { this.humidity = humidity; }
    }

    static class Weather {
        private String description;

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }
}
