package com.bio.profile.dao.impl;

import com.bio.dao.AbstractBaseDaoImpl;
import com.bio.profile.dao.IProfileRepository;
import com.bio.profile.models.Profile;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository extends AbstractBaseDaoImpl<Profile> implements IProfileRepository {

    @Override
    public Profile findById(String id) throws Exception {
        Profile profile =  findById(Profile.class, id);
        System.out.println("Profile: "+ profile);
        return profile;
    }
}
