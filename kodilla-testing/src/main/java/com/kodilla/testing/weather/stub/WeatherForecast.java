package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperaturesList = new ArrayList<>();
        double result;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);
        if (temperaturesList.size() % 2 == 0) {
            int mid = temperaturesList.size() / 2;
            result = (temperaturesList.get(mid) + temperaturesList.get(mid - 1)) / 2.0;
        } else {
            result = temperaturesList.get(temperaturesList.size() / 2);
        }
        return result;
    }


}