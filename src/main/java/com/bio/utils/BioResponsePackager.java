package com.bio.utils;


import com.bio.models.BioResponseMeta;
import com.bio.models.BioResponsePackage;
import org.springframework.stereotype.Component;

@Component
public class BioResponsePackager<T> {

    public BioResponsePackage generateSuccessResponse(T t) {
        BioResponsePackage<T> bioResponsePackage = new BioResponsePackage<>();
        bioResponsePackage.setData(t);
        bioResponsePackage.setMeta(new BioResponseMeta(200, "success"));
        return bioResponsePackage;
    }

    public BioResponsePackage generateErrResponse(T t, String err) {
        BioResponsePackage<T> bioResponsePackage = new BioResponsePackage<>();
        bioResponsePackage.setData(t);
        bioResponsePackage.setMeta(new BioResponseMeta(500, err));
        return bioResponsePackage;
    }
}
