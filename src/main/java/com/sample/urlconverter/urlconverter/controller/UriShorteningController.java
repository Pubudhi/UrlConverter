package com.sample.urlconverter.urlconverter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urlConverter/v0.0.1/url")
public class UriShorteningController {

    @PostMapping("/shorten")
    public ResponseEntity<ShortenUrlDTO> shortenUrlDTOResponseEntity (@Validate @RequestBody OriginalDTO originalDTO){

    }

}
