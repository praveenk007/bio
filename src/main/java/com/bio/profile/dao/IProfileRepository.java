package com.bio.profile.dao;

import com.bio.profile.models.Profile;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.Repository;

import java.math.BigInteger;

//@Repository
public interface IProfileRepository extends Repository<Profile, BigInteger> {

    @Query("{'f_name' : 'Praveen'}")
    Profile findEnabled() throws  Exception;
}
