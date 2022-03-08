package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Skill extends AbstractEntity {

//    @ManyToMany
    private String descriptionOfSkill;

    public Skill() {
    }

    public String getDescriptionOfSkill() {
        return descriptionOfSkill;
    }

    public void setDescriptionOfSkill(String descriptionOfSkill) {
        this.descriptionOfSkill = descriptionOfSkill;
    }
}