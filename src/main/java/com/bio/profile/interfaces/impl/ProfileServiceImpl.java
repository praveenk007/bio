package com.bio.profile.interfaces.impl;


import com.bio.profile.interfaces.IProfileService;
import com.bio.profile.models.Profile;
import reactor.core.publisher.Mono;

public class ProfileServiceImpl implements IProfileService {

    @Override
    public Mono<Profile> getProfile() {
        return null;
    }
}
