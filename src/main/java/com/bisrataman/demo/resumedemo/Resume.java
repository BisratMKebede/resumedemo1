package com.bisrataman.demo.resumedemo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class Resume {
    @NotEmpty
    @Size(min=2)
    private String name;

    @NotEmpty
    @Size(min=6)
    private String email;

    @NotEmpty
    @Size(min=10)
    private String education;

    @NotEmpty
    @Size(min=10)
    private String experience;

    @NotEmpty
    @Size(min=10)
    private String skill;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
