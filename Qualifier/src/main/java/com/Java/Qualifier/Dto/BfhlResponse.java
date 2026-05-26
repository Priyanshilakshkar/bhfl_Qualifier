package com.Java.Qualifier.Dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BfhlResponse {
    private boolean is_success;

    private String user_id;

    private String email;

    private String roll_number;

    private List<String> odd_numbers;

    private List<String> even_numbers;

    private List<String> alphabets;

    private List<String> special_characters;

    private String sum;

    private String concat_string;
}
