package com.Java.Qualifier.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Java.Qualifier.Dto.BfhlRequest;
import com.Java.Qualifier.Dto.BfhlResponse;

@Service
public class BfhlServiceImpl implements BfhlService {
    @Override
    public BfhlResponse processData(BfhlRequest request) {

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialChars = new ArrayList<>();

        int sum = 0;

        StringBuilder alphaConcat = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                int num = Integer.parseInt(item);

                sum += num;

                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                alphaConcat.append(item);

            } else {

                specialChars.add(item);
            }
        }

        String concatString = buildAlternateCapsReverse(alphaConcat.toString());

        return BfhlResponse.builder()
                .is_success(true)
                .user_id("priyanshi_lakshkar_12122005")
                .email("priyanshilakshkar230563@acropolis.in")
                .roll_number("0827CS231197")
                .odd_numbers(oddNumbers)
                .even_numbers(evenNumbers)
                .alphabets(alphabets)
                .special_characters(specialChars)
                .sum(String.valueOf(sum))
                .concat_string(concatString)
                .build();
    }

    private String buildAlternateCapsReverse(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {

            char ch = reversed.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }
}
