package com.ge.predix.solsvc.common;

/**
 * Created by made_sudarsana on 6/5/2017.
 */
public class ArduinoWrapper {
    private String name;
    private Double temperature;
    private Double humidity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }
}
