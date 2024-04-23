package edu.tucn.ispse.lecture10.ex10completablefuturegui;

/**
 * @author Radu Miron
 * @version 1
 */
public record TemperatureModel(CurrentUnits current_units, Current current) {
}

record Current(float temperature_2m){
}

record CurrentUnits(String temperature_2m){
}
