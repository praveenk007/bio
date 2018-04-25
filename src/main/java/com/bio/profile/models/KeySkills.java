package com.bio.profile.models;

import com.bio.profile.enums.ProfeciencyLevelEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class KeySkills {

    @JsonProperty("tech")
    @Field("tech")
    private String technology;

    private ProfeciencyLevelEnum level;

    @JsonProperty("profeciency_in_percent")
    @Field("profeciency_in_percent")
    private int prefeciencyInPercent;
}
