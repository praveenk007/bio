package com.bio.profile.services.impl;


import com.bio.profile.dao.IProfileRepository;
import com.bio.profile.services.IProfileService;
import com.bio.profile.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ProfileServiceImpl implements IProfileService {

    @Autowired
    IProfileRepository profileRepository;

    @Override
    public Mono<Profile> getProfile(String id) throws Exception {
        return Mono.just(profileRepository.findById(id));
    }
}