package com.bio.profile.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Profile {

    private String _id;

    private String fName;

    private String lName;

    private int    age;

    public Profile() {
    }

    public Profile(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
}
