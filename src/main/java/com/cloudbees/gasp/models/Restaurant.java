package com.cloudbees.gasp.models;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Kohsuke Kawaguchi
 */
@Entity
public class Restaurant {
    @JsonProperty
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    /**
     * Human readable name of the restaurant.
     */
    @JsonProperty
    @Column
    private String name;

    /**
     * URL of the restaurant website.
     */
    @JsonProperty
    @Column
    private String website;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return "/restaurants/"+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
