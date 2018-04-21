package com.bio.profile.interfaces;


import com.bio.profile.models.Profile;
import reactor.core.publisher.Mono;

public interface IProfileService {

    public Mono<Profile> getProfile();
}
