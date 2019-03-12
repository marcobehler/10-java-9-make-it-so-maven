package de.marcobehler.web;

import de.marcobehler.service.BitcoinService;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class TradingApp {

    public static void main(String[] args) {
        System.out.println(new BitcoinService().mine());
    }

}
