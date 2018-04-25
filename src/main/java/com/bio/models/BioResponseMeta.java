package com.bio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BioResponseMeta {

    @JsonProperty("status_code")
    private int     statusCode;

    private String  msg;

    public BioResponseMeta(int statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
}
