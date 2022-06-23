package com.codestates;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class RestClientExample02 {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());


        UriComponents uriComponents =
                UriComponentsBuilder
                        .newInstance()
                        .scheme("http")
                        .host("worldtimeapi.org")
                        .path("/api/timezone/{continents}/{city}")
                        .encode()
                        .build();
        URI uri= uriComponents.expand("Asia","Seoul").toUri();

        ResponseEntity<WorldTime> response = restTemplate.exchange(uri,
                HttpMethod.GET,
                null,
                WorldTime.class);

        System.out.println("# datatime: " + response.getBody().getDatetime());
        System.out.println("# timezone: " + response.getBody().getTimezone());
        System.out.println("# day_of_week: " + response.getBody().getDay_of_week());
        System.out.println("# HTTP Status Code: " + response.getStatusCode());
        System.out.println("# HTTP Status Value: " + response.getStatusCodeValue());

    }
}
