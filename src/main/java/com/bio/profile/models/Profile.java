package com.bio.profile.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Profile")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Profile {

    private String _id;

    @JsonProperty("f_name")
    @Field("f_name")
    private String fName;

    @JsonProperty("l_name")
    @Field("l_name")
    private String lName;

    private int    age;

    @JsonProperty("about_me")
    @Field("about_me")
    private List<String> aboutMe;

    private String alias;

    private String role;

    private String designation;

    @JsonProperty("key_skills")
    @Field("key_skills")
    private List<KeySkills> keySkills;

    @JsonProperty("total_exp_in_months")
    @Field("total_exp_in_months")
    private int totalExpInMonths;

    private List<String> hobbies;

    /**
     * Default constructor
     */
    public Profile() {
    }

    public Profile(String _id, String fName, String lName, int age, List<String> aboutMe, String alias, String role, String designation, List<KeySkills> keySkills, int totalExpInMonths, List<String> hobbies) {
        this._id = _id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.aboutMe = aboutMe;
        this.alias = alias;
        this.role = role;
        this.designation = designation;
        this.keySkills = keySkills;
        this.totalExpInMonths = totalExpInMonths;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "_id='" + _id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", aboutMe=" + aboutMe +
                ", alias='" + alias + '\'' +
                ", role='" + role + '\'' +
                ", designation='" + designation + '\'' +
                ", keySkills=" + keySkills +
                ", totalExpInMonths=" + totalExpInMonths +
                ", hobbies=" + hobbies +
                '}';
    }
}
