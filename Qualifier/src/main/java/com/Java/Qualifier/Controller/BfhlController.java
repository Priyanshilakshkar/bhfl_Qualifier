package com.Java.Qualifier.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Java.Qualifier.Dto.BfhlRequest;
import com.Java.Qualifier.Dto.BfhlResponse;
import com.Java.Qualifier.Service.BfhlService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bfhl")
@RequiredArgsConstructor
public class BfhlController {
    private final BfhlService bfhlService;

    @PostMapping
    public ResponseEntity<BfhlResponse> process(@RequestBody BfhlRequest request) {

        return ResponseEntity.ok(
                bfhlService.processData(request));
    }
}
