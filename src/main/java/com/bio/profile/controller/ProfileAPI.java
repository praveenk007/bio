package com.bio.profile.controller;

import com.bio.profile.models.Profile;
import com.bio.profile.services.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProfileAPI {

    @Autowired
    IProfileService profileService;

    @GetMapping("/getprofile/{id}")
    Mono<Profile> getProfile(@PathVariable String id) {
        try {
            return profileService.getProfile(id);
        } catch (Exception e) {
            e.printStackTrace();
            return Mono.just(null);
        }

    }

    /*@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE, value = "/profiles")
    Flux<Profile> getProfiles() {
        Flux<Profile> profileFlux = Flux.fromStream(Stream.generate(() -> new Profile("p", "k", 24)));
        Flux<Long> delayFlux = Flux.interval(Duration.ofSeconds(1));
        return Flux.zip(profileFlux, delayFlux).map(t -> t.getT1());
    }*/
}
