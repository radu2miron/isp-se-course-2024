package edu.tucn.ispse.lecture10.ex9futuregui;

/**
 * @author Radu Miron
 * @version 1
 */
public record Coin(Data data) {
}

record Data(String rank, String name, String marketCapUsd, String priceUsd) {
}