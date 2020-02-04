package com.sample.urlconverter.urlconverter.dto;

import org.hibernate.validator.constraints.URL;
import javax.validation.constraints.NotEmpty;

/**
 *
 */
public class ShortenUrlDTO {

    @NotEmpty(message = "{val.err.shorten.url.not.empty.or.null}")
    @URL(message = "{val.err.shorten.url.invalid}")
    private String shortenUrl;

    public ShortenUrlDTO() {
    }

    public ShortenUrlDTO(String shortenUrl) {
        this.shortenUrl = shortenUrl;
    }

    public String getShortenUrl() {
        return shortenUrl;
    }

    public void setShortenUrl(String shortenUrl) {
        this.shortenUrl = shortenUrl;
    }

}
