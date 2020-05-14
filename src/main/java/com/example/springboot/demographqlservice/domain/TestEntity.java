package com.example.springboot.demographqlservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TestEntity extends BaseObject{

    private String description;

    private List<PropertyObject> properties;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PropertyObject> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyObject> properties) {
        this.properties = properties;
    }
}
