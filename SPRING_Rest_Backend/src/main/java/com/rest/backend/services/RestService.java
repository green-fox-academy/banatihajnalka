package com.rest.backend.services;

import com.rest.backend.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class RestService {

    public Doubling getDoubling(Integer input) {
        return new Doubling(input, input * 2);
    }

    public AppendA append(String appendable) {
        return new AppendA(appendable + "a");
    }

    public Integer doUntil(DoUntil until, String action) {
        int result = 0;
        if (action.equals("sum")) {
            result = sum(until);
        } else if (action.equals("factor")) {
            result = factor(until);
        }
        return result;
    }

    public Integer factor(DoUntil until) {
        int f = 1;
        for (int i = 1; i <= until.getUntil(); i++) {
            f *= i;
        }
        return f;
    }

    public Integer sum(DoUntil until) {
        int s = 0;
        for (int i = 1; i <= until.getUntil(); i++) {
            s += i;
        }
        return s;
    }

    public Integer doWithArrayToInteger(Arrayhandler arrayhandler, String what) {
        int result = 0;
        if (arrayhandler.getWhat().equals("sum")) {
            result = sumArray(arrayhandler.getNumbers());
        } else if (arrayhandler.getWhat().equals("multiply")) {
            result = multiplyArray(arrayhandler.getNumbers());
        }
        return result;
    }

    private int sumArray(Integer[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private int multiplyArray(Integer[] numbers) {
        int multiplied = 1;
        for (int number : numbers) {
            multiplied *= number;
        }
        return multiplied;
    }

    public Integer[] doubleArrayElements(Integer[] numbers) {
        Integer[] result = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            result[i] = numbers[i] * 2;
        }
        return result;
    }

    public String translateSithText(String text) {
        String[] splitText = text.split(" ");
        List<String> splitList = new ArrayList<String>(Arrays.asList(splitText));
        List<String> arrangedList = new ArrayList<>();
        for (int i = 1; i < splitList.size(); i += 2) {
            arrangedList.add(splitList.get(i));
            for (int j = 0; j < splitList.size(); j += 2) {
                arrangedList.add(splitList.get(j));
            }
        }
        return arrangedList.toString();
    }

    public String teveTranslator(String text) {
        int length = text.length();
        int i = 0;
        while (i < length) {
            char characters = text.charAt(i);
            if (isVowel(characters)) {
                text =  String.join(characters + "v" + characters, text.split("" + characters, text.length()));
                i += 3;
                length += 2;
            }
            i++;
        }
        return text;
    }

    boolean isVowel(char character) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'U', 'O', 'E', 'I',
                'á', 'Á', 'é', 'É', 'Í', 'í', 'ó', 'Ó', 'ö', 'Ő', 'Ö', 'ő', 'ú',
                'Ú', 'Ü', 'ü', 'ű', 'Ű').contains(character);
    }
}


