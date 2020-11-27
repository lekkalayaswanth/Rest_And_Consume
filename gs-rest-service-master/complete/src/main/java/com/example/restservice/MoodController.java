package com.example.restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoodController {

    private static final String template = "%s Dayss!";

    @PostMapping("/greetingMood")
    public GreetingMood greetingMood(@RequestParam(value = "mood", defaultValue = "1") int id) {
        String mood;
        switch (id) {
            case 1:
                mood = "Good";
                //System.out.println(mood + " day!");
                break;
            case 2:
                mood = "Bad";
                //System.out.println(mood + " day!");
                break;
            case 3:
                mood = "Amazing";
                //System.out.println(mood + " day!");
                break;
            default:
                mood = "Ok";
            //System.out.println(mood + " day!");
        }
        return new GreetingMood(String.format(template, mood));

    }
}
