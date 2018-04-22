package com.bio.profile.dao;

import com.bio.profile.models.Profile;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfileRepository {
    Profile findById(String name) throws  Exception;
}
