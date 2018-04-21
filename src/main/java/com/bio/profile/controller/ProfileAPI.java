package com.bio.profile.controller;

import com.bio.profile.models.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.time.Duration;
import java.util.stream.Stream;

@RestController
public class ProfileAPI {

    @GetMapping("/profile/{id}")
    Mono<Profile> getProfile(@PathVariable long id) {
        return Mono.just(new Profile("pk", "pk", 23));
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE, value = "/profiles")
    Flux<Profile> getProfiles() {
        Flux<Profile> profileFlux = Flux.fromStream(Stream.generate(() -> new Profile("p", "k", 24)));
        Flux<Long> delayFlux = Flux.interval(Duration.ofSeconds(1));
        return Flux.zip(profileFlux, delayFlux).map(t -> t.getT1());
    }
}
