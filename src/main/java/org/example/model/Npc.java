package org.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Npc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String job;
    private String description;
    private int charismaId;
    private int strengthId;
    private int WisdomId;
    private int intellectId;
    private int dexterityId;
    private int constitutionId;
    private int raceId;
    private int statusId;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCharismaId() {
        return charismaId;
    }

    public void setCharismaId(int charismaId) {
        this.charismaId = charismaId;
    }

    public int getStrengthId() {
        return strengthId;
    }

    public void setStrengthId(int strengthId) {
        this.strengthId = strengthId;
    }

    public int getWisdomId() {
        return WisdomId;
    }

    public void setWisdomId(int wisdomId) {
        WisdomId = wisdomId;
    }

    public int getIntellectId() {
        return intellectId;
    }

    public void setIntellectId(int intellectId) {
        this.intellectId = intellectId;
    }

    public int getDexterityId() {
        return dexterityId;
    }

    public void setDexterityId(int dexterityId) {
        this.dexterityId = dexterityId;
    }

    public int getConstitutionId() {
        return constitutionId;
    }

    public void setConstitutionId(int constitutionId) {
        this.constitutionId = constitutionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
