package com.bio.profile.services;


import com.bio.profile.models.Profile;
import reactor.core.publisher.Mono;

public interface IProfileService {

    public Mono<Profile> getProfile() throws Exception;
}
