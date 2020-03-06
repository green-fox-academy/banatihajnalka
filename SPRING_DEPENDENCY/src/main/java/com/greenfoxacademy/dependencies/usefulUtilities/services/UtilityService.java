package com.greenfoxacademy.dependencies.usefulUtilities.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {

    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }


    public String caesar(String text, Integer number) {
        if ((text == null) || (number == null)) {
            return "Please give me a text and a number in the URL!";
        }
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}

//    public String renderCaesar(String text, Integer number, boolean encode) {
//        if ((text == null) || (number == null)) {
//            return "Please give me a text and a number in the URL!";
//        } else {
//            if (!encode) {
//                return caesar(text, -number);
//            } else {
//                return caesar(text, number);
//            }
//        }
//    }


