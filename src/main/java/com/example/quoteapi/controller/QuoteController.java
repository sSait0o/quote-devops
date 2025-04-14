package com.example.quoteapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class QuoteController {

    private String[] quotes = {
        "La vie est ce qui arrive quand on a prévu autre chose.",
        "Il n'y a pas de raccourci vers n'importe où qui en vaille la peine.",
        "Le seul moyen de faire du bon travail est d'aimer ce que vous faites.",
        "Le bonheur n’est pas quelque chose de prêt à l’emploi, il vient de vos propres actions."
    };

    @GetMapping("/quote")
    public String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
}
